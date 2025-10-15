package com.huifu.dg.lightning.biz.payment.create;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.WxData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/13 10:55
 * @description 微信小程序支付demo
 */
public class T_MINIAPPTest {

    public static void main(String[] args) throws Exception {
        T_MINIAPP();
        //T_MINIAPP2();
    }

    public static void T_MINIAPP() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109111111"); // 商户号
        request.setGoodsDesc("上海合力批发站（货款）");// 商品描述
        request.setTransAmt("20.00"); // 交易金额
        request.setRemark("JSPAY:ID:102");//交易备注
// 设置超时时间
        request.setTimeExpire("20250916202931");
// 设置异步通知地址
        request.setNotifyUrl("https:/www.demoSite.com/api/public/hf/smstorecallback");
// 延迟交易能力 延迟入账标识
        request.setDelayAcctFlag("N");
// 实时分账能力 设置分账信息，需要分账权限
// request.setAcctSplitBunch("{\"acct_infos\":[{\"div_amt\":\"4.00\",\"huifu_id\":\"666600016871111\"}," +
// 						  "{\"div_amt\":\"16.00\",\"huifu_id\":\"6666000169391112\"}]}");

//以下为微信小程序需要的参数
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        String wxDataString="";
// {"sub_appid":"wxa350b4c0fd003192","sub_openid":"o4n3E6q8MOEQefCsGKVOAh40spNw"}
        WxData wxData = new WxData();
        wxData.setSubOpenid("o8jhotzittQSeFF-N0Yj4Hz91Rqc");
        wxData.setSubAppid("wx4f4f5a5f5a5f5aFF");
//微信相关参数可参考官方文档 https://pay.weixin.qq.com/doc/v2/merchant/4011935214
//复杂{"body":"香土鸡餐馆：线下支付","detail":{"cost_price":"1.0","goods_detail":[{"goods_id":"1967776038541551111","goods_name":"香土鸡餐馆：线下支付","price":"1.0","quantity":1}],"receipt_id":"1970743410445500000"},"scene_info":{"store_info":{"id":"1967776038541550000","name":"香土鸡餐馆：线下支付"}},"sub_appid":"wx969f2ef2df1111","sub_openid":"oqVX87O2I2U3rT-BBBBBBBB-YsU"}
        wxDataString = objectMapper.writeValueAsString(wxData);
        request.setTradeType("T_MINIAPP"); // 交易类型 - 微信小程序
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", objectMapper.writeValueAsString(wxDataString)).create(request);
        System.out.println("T_JSAPI返回数据:" + JacksonUtils.convert2JsonString(response));
    }


    public static void T_MINIAPP2() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());


        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109111111"); // 商户号
        request.setGoodsDesc("上海合力批发站（货款）");// 商品描述
        request.setTransAmt("20.00"); // 交易金额
        request.setRemark("JSPAY:ID:102");//交易备注
        request.setNotifyUrl("https:/www.demoSite.com/api/public/hf/smstorecallback");

        request.setTradeType("T_MINIAPP"); // 交易类型 - 微信小程序
        //以下为微信小程序需要的参数
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        String wxDataString="";
        WxData wxData = new WxData();
        wxData.setSubOpenid("o8jhotzittQSeFF-N0Yj4Hz91Rqc");
        wxData.setSubAppid("wx4f4f5a5f5a5f5aFF");
        //微信相关参数可参考官方文档 https://pay.weixin.qq.com/doc/v2/merchant/4011935214
        //复杂{"body":"香土鸡餐馆：线下支付","detail":{"cost_price":"1.0","goods_detail":[{"goods_id":"1967776038541551111","goods_name":"香土鸡餐馆：线下支付","price":"1.0","quantity":1}],"receipt_id":"1970743410445500000"},"scene_info":{"store_info":{"id":"1967776038541550000","name":"香土鸡餐馆：线下支付"}},"sub_appid":"wx969f2ef2df1111","sub_openid":"oqVX87O2I2U3rT-BBBBBBBB-YsU"}
        wxDataString = objectMapper.writeValueAsString(wxData);

        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", objectMapper.writeValueAsString(wxDataString)).create(request);
        System.out.println("T_JSAPI返回数据:" + JacksonUtils.convert2JsonString(response));
    }

}

