package com.huifu.dg.lightning.biz.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.biz.exception.BasePayException;
import com.huifu.dg.lightning.biz.exception.FailureCode;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentPayRequest;
import com.huifu.dg.lightning.models.AlipayData;
import com.huifu.dg.lightning.models.UnionpayData;
import com.huifu.dg.lightning.models.WxData;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;
import com.huifu.dg.lightning.utils.enums.PaymentTypeEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 15:31
 * @description
 */
public class AggregateTransRequestDemo {


    public static void test() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentPayRequest request = new TradePaymentPayRequest();
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
        System.out.println("返回数据:" +JacksonUtils.convert2JsonString(response) );

    }


    public static void test2() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentPayRequest request = new TradePaymentPayRequest();
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
                .optional("method_expand", getMethodExpand(request.getTradeType())).create(request);
        System.out.println("返回数据:" +JacksonUtils.convert2JsonString(response) );

    }


    public static void test3() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentPayRequest request = new TradePaymentPayRequest();
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
                .optional("seller", "lisi")
                .optional("method_expand", getWxData()).create(request);
        System.out.println("返回数据:" +JacksonUtils.convert2JsonString(response) );

    }


    public static void test4() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentPayRequest request = new TradePaymentPayRequest();
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
        System.out.println("返回数据:" +JacksonUtils.convert2JsonString(response) );

    }

    private static String getWxData() throws Exception {
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        ObjectNode objectNode = objectMapper.createObjectNode();
        // 子商户应用ID
        objectNode.put("sub_appid", "wxdfe9a5d141f96685");
        // 子商户用户标识
        objectNode.put("sub_openid", "o8jhotzittQSetZ-N0Yj4Hz91Rqc");
        return JacksonUtils.convert2JsonString(objectNode);
    }

    private static String getMethodExpand(String tradeType) throws Exception{
        if (StringUtils.isBlank(tradeType)) {
            throw new BasePayException(FailureCode.REQUEST_PARAMETER_ERROR);
        }
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        if (PaymentTypeEnum.T_JSAPI.getTypeCode().equals(tradeType) || PaymentTypeEnum.T_MINIAPP.getTypeCode().equals(tradeType)
                || PaymentTypeEnum.T_APP.getTypeCode().equals(tradeType) || PaymentTypeEnum.T_MICROPAY.getTypeCode().equals(tradeType)) {
            WxData wxData = new WxData();
            wxData.setSubOpenid("o8jhotzittQSetZ-N0Yj4Hz91Rqc");
            wxData.setSubAppid("wx4f4f5a5f5a5f5a5f");
            return objectMapper.writeValueAsString(wxData);
        }
        if (PaymentTypeEnum.A_JSAPI.getTypeCode().equals(tradeType) || PaymentTypeEnum.A_NATIVE.getTypeCode().equals(tradeType)
                || PaymentTypeEnum.A_MICROPAY.getTypeCode().equals(tradeType)) {
            AlipayData alipayData = new AlipayData();
            alipayData.setAlipayStoreId("ali-542323asdas12351a51");
            alipayData.setBuyerId("ali4f4f5a5f5a5f5a5f");
            return objectMapper.writeValueAsString(alipayData);
        }
        if (PaymentTypeEnum.U_JSAPI.getTypeCode().equals(tradeType) || PaymentTypeEnum.U_NATIVE.getTypeCode().equals(tradeType)
                || PaymentTypeEnum.U_MICROPAY.getTypeCode().equals(tradeType)) {
            UnionpayData unionpayData = new UnionpayData();
            unionpayData.setQrCode("union-542323asdas12351a51");
            unionpayData.setUserId("union4f4f5a5f5a5f5a5f");
            return objectMapper.writeValueAsString(unionpayData);
        }
        return null;
    }


    public static void main(String[] args) throws Exception{

        test();

    }

}
