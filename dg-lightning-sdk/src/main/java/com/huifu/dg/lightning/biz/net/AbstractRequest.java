package com.huifu.dg.lightning.biz.net;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.biz.exception.BasePayException;
import com.huifu.dg.lightning.biz.exception.FailureCode;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.HttpClientUtils;
import com.huifu.dg.lightning.utils.JsonUtils;
import com.huifu.dg.lightning.utils.RsaUtils;
import com.huifu.dg.lightning.utils.StringUtil;
import com.huifu.dg.lightning.utils.enums.ServerTypeEnum;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
public abstract class AbstractRequest {

    public static final String SDK_VERSION = "1.0.3";

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
        String reqData = JSONObject.toJSONString(params);

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

        Map<String, Object> request = new HashMap<>();
        request.put("sys_id", config.getSysId());
        request.put("data", JSONObject.parseObject(reqData));
        request.put("sign", requestSign);
        request.put("product_id", config.getProductId());

        String requestBody = JSON.toJSONString(request);
        if (BasePay.debug) {
            System.out.println("request data = " + JSONObject.parseObject(reqData));
            System.out.println("requestBody param = " + requestBody);
        }

        if ((RequestMethod.POST == method) && (file == null) && "v2/supplementary/picture".equals(uri)) {
            back = HttpClientUtils.httpPostNoFile(requestUrl.toString(), headers, request, null, fileParam);
        } else if ((RequestMethod.POST == method) && (file == null)) {
            back = HttpClientUtils.httpPostJson(requestUrl.toString(), headers, requestBody);
        } else if ((RequestMethod.POST == method) && (file != null)) {
            back = HttpClientUtils.httpPostFile(requestUrl.toString(), headers, request, file, fileParam);
        } else if (RequestMethod.GET == method) {
            back = HttpClientUtils.httpGet(requestUrl.toString(), headers, params);
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

        JSONObject jo = JSON.parseObject(back);

        JSONObject data = jo.getJSONObject("data");
        String sign = jo.getString("sign");
        String publicKey = config.getRsaPublicKey();
        if (StringUtil.isEmpty(publicKey)) {
            publicKey = BasePay.HUIFU_DEFAULT_PUBLIC_KEY;
        }
        if (BasePay.debug) {
            System.out.println("PUBLIC_KEY=" + publicKey);
            System.out.println("response data=" + data);
            System.out.println("response sign:" + sign);
        }
        boolean checkSign;
        try {
            String sortedData = JsonUtils.sort4JsonString(JSONObject.toJSONString(data), 5);
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


}
