package com.huifu.dg.lightning.biz.net;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.biz.exception.BasePayException;
import com.huifu.dg.lightning.biz.exception.FailureCode;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.JsonUtils;
import com.huifu.dg.lightning.utils.OkHttpClientTools;
import com.huifu.dg.lightning.utils.RsaUtils;
import com.huifu.dg.lightning.utils.enums.ServerTypeEnum;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
public abstract class AbstractRequest {

    public static final String SDK_VERSION = "1.0.1-SNAPSHOT";

    protected static enum RequestMethod {
        GET, POST, DELETE, PUT;

        private RequestMethod() {
        }
    }

    protected static Map<String, Object> requestBasePayCore(RequestMethod method, String uri, Map<String, Object> params, MerConfig config, boolean isPage)
            throws BasePayException {
        return requestBasePayCore(method, uri, params, null, null, config, null, isPage);
    }

    protected static Map<String, Object> requestBasePayCore(RequestMethod method, String uri, Map<String, Object> params, MerConfig config, ServerTypeEnum serverType, boolean isPage)
            throws BasePayException {
        return requestBasePayCore(method, uri, params, null, null, config, serverType, isPage);
    }

    public static String getUrl() {
        String baseUrl;
        switch (BasePay.prodMode) {
            case BasePay.MODE_TEST:
                baseUrl = BasePay.apiBaseTest;
                break;
            case BasePay.MODE_INNER_TEST:
                baseUrl = BasePay.apiBaseMock;
                break;
            default:
                baseUrl = BasePay.apiBase;
                break;
        }
        return baseUrl;
    }

    protected static Map<String, Object> requestBasePayCore(RequestMethod method, String uri, Map<String, Object> params, File file, String fileParam, MerConfig config, ServerTypeEnum serverType, boolean isPage) throws BasePayException {
        String baseUrl = getUrl();
        if (ServerTypeEnum.PAGE.equals(serverType)) {
            baseUrl = getUrl();
        }
        //指定baseUrl
        if (params != null && params.get("base_url") != null) {
            baseUrl = (String) params.get("base_url");
            params.remove("base_url");

        }
        StringBuilder requestUrl = new StringBuilder(baseUrl);
        if (!baseUrl.endsWith("/")) {
            requestUrl.append("/");
        }
        requestUrl.append(uri);
        String back = null;
        Map<String, String> headers = new HashMap<>(4);
        // 传递SDK版本 再传一个jpt前缀的，以便打印至网关log
        headers.put("sdk_version", "javaSDK_lightning_" + SDK_VERSION);
        headers.put("jpt-sdk_version", "javaSDK_lightning_" + SDK_VERSION);
        headers.put("sys_id", config.getSysId());
        headers.put("jpt-sys_id", config.getSysId());
        ObjectMapper mapper = JacksonUtils.getInstance();
        String reqData = null;
        try {
            reqData = mapper.writeValueAsString(params);
        } catch (JsonProcessingException e) {
            throw new BasePayException(FailureCode.REQUEST_PARAMETER_ERROR.getFailureCode(), "param convert error.");
        }


        String privateKey = config.getRsaPrivateKey();
        if (BasePay.debug) {
            System.out.println("PRIVATE_KEY=" + privateKey);
        }
        String requestSign;
        try {
            String sortedData = JsonUtils.sort4JsonString(reqData, 0);
            requestSign = RsaUtils.sign(sortedData, privateKey);
        } catch (Exception e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            requestSign = null;
        }
        if ((requestSign == null) || (requestSign.length() == 0)) {
            throw new BasePayException(FailureCode.SECURITY_EXCEPTION.getFailureCode(), "Sign error. Please check your privateKey.");
        }
        if (BasePay.debug) {
            System.out.println("request sign=" + requestSign);
        }
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        Map<String, Object> request = null;
        String requestBody = null;
        try {
            request = new HashMap<>();
            request.put("sys_id", config.getSysId());
            // request.put("data", JSONObject.parseObject(reqData));
            request.put("data", objectMapper.readValue(reqData, new TypeReference<Object>() {
            }));
            request.put("sign", requestSign);
            request.put("product_id", config.getProductId());

            //   String requestBody = JSON.toJSONString(request);
            requestBody = objectMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            throw new BasePayException(FailureCode.REQUEST_PARAMETER_ERROR.getFailureCode(), "param request convert error.");
        }
        if ((RequestMethod.POST == method) && (file == null) && "v2/supplementary/picture".equals(uri)) {
            back = OkHttpClientTools.httpPost(requestUrl.toString(), requestBody, config.getProductId(),headers);
        } else if ((RequestMethod.POST == method) && (file == null)) {
            back = OkHttpClientTools.httpPost(requestUrl.toString(), requestBody, config.getProductId(),headers);
        } else if ((RequestMethod.POST == method) && (file != null)) {
            back = OkHttpClientTools.httpPostFile(requestUrl.toString(), requestBody, config.getProductId(), file,headers);
        } else if (RequestMethod.GET == method) {
            back = OkHttpClientTools.httpGet(requestUrl.toString(), requestBody, config.getProductId(),headers);
        }
        if (BasePay.debug) {
            System.out.println("response string=" + back);
        }
        if ((back == null) || (back.length() == 0)) {
            throw new BasePayException(FailureCode.SYSTEM_EXCEPTION.getFailureCode(), "Request no response. Please check your network.");
        }
        if (BasePay.debug) {
            System.out.println("Is a version of the page=" + isPage);
        }
        if (isPage) {
            // 页面版本支付，需要将页面直接返回给
            Map<String, Object> data = new HashMap<>();
            data.put("data", back);
            return data;
        }

        /*JSONObject jo = JSON.parseObject(back);

        JSONObject data = jo.getJSONObject("data");
        String sign = jo.getString("sign");*/
        JsonNode node = null;
        try {
            node = objectMapper.readTree(back);
        } catch (JsonProcessingException e) {
            throw new BasePayException(FailureCode.SYSTEM_EXCEPTION.getFailureCode(), "response convert error.");
        }
        JsonNode data = checkSign(config, mapper, node);
        Map<String, Object> respData =mapper.convertValue(data, new TypeReference<Map<String, Object>>() {
        });
        return respData;
    }

    private static JsonNode checkSign(MerConfig config, ObjectMapper mapper, JsonNode node) throws BasePayException {

        JsonNode data = node.get("data");
        JsonNode signNode = node.get("sign");
        if(signNode==null){
            if (BasePay.debug) {
                System.out.println("签名为空");
            }
            return data;
        }
        String sign = node.get("sign").asText();
        String publicKey = config.getRsaPublicKey();
        if (StringUtils.isEmpty(publicKey)) {
            publicKey = BasePay.HUIFU_DEFAULT_PUBLIC_KEY;
        }
        if (BasePay.debug) {
            System.out.println("PUBLIC_KEY=" + publicKey);
            System.out.println("response data=" + data);
            System.out.println("response sign:" + sign);
        }
        boolean checkSign;
        try {
            String sortedData = JsonUtils.sort4JsonString(mapper.writeValueAsString(data), 5);
            checkSign = RsaUtils.verify(sortedData, publicKey, sign);
        } catch (Exception e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            checkSign = false;
        }
        if (!checkSign) {
            if (BasePay.debug) {
                System.out.println("验证签名失败");
            }
            throw new BasePayException(FailureCode.SECURITY_EXCEPTION.getFailureCode(), "Response sign check error. Please check your pubkey.");
        }
        return data;
    }


    public static String getOriginalStr(Map<String, Object> map) {
        List<String> listKeys = new ArrayList<>(map.keySet());
        Collections.sort(listKeys);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listKeys.size(); i++) {
            if ((map.get(listKeys.get(i)) != null) && (map.get(listKeys.get(i)).toString().length() != 0)) {
                stringBuilder.append((String) listKeys.get(i)).append("=").append(map.get(listKeys.get(i))).append("&");
            }
        }
        return stringBuilder.length() == 0 ? "" : stringBuilder.toString().substring(0, stringBuilder.length() - 1);
    }
}
