package com.huifu.dg.lightning.biz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.PaymentRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 15:31
 * @description
 */
public class DemoTest2 {


    public static void test() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        PaymentRequest request = new PaymentRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 商品描述
        request.setGoodsDesc("hibs自动化-通用版验证");
        // 交易类型
        request.setTradeType("A_NATIVE");
        // 交易金额
        request.setTransAmt("0.10");
        Map<String, Object> response = Factory.Payment.Common().create(request);
        System.out.println("返回数据:" +toJsonString(response) );

    }

    private static String toJsonString( Map<String, Object> response) throws Exception{
        ObjectMapper objectMapper = JacksonUtils.getInstance();
       return  objectMapper.writeValueAsString(response);
    }



    public static void test2() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        PaymentRequest request = new PaymentRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 商品描述
        request.setGoodsDesc("hibs自动化-通用版验证test2");
        // 交易类型
        request.setTradeType("A_NATIVE");
        // 交易金额
        request.setTransAmt("0.10");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("wx_data",getWxData()).create(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" +objectMapper.writeValueAsString(response) );

    }


    public static void test3() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        PaymentRequest request = new PaymentRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 商品描述
        request.setGoodsDesc("hibs自动化-通用版验证test3");
        // 交易类型
        request.setTradeType("T_JSAPI");
        // 交易金额
        request.setTransAmt("0.10");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("seller","lisi")
                .optional("wx_data",getWxData()).create(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" +objectMapper.writeValueAsString(response) );

    }


    public static void test4() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        PaymentRequest request = new PaymentRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 商品描述
        request.setGoodsDesc("hibs自动化-通用版验证");
        // 交易类型
        request.setTradeType("A_NATIVE");
        // 交易金额
        request.setTransAmt("0.10");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("seller","zhangsan")
                .optional("wx_data",getWxData()).create(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" +objectMapper.writeValueAsString(response) );

    }

    private static String getWxData() throws Exception {
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        ObjectNode objectNode = objectMapper.createObjectNode();
        // 子商户应用ID
        objectNode.put("sub_appid", "wxdfe9a5d141f96685");
        // 子商户用户标识
        objectNode.put("sub_openid", "o8jhotzittQSetZ-N0Yj4Hz91Rqc");
        return objectMapper.writeValueAsString(objectNode);
    }


    public static void main(String[] args) throws Exception{

        test();
        test2();
        test3();
        test4();
    }

}
