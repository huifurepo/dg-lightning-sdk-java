package com.huifu.dg.lightning.biz.payment.create;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AlipayData;
import com.huifu.dg.lightning.models.WxData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;
/**
 * @author bo.dong
 * @date 2025/10/13 11:23
 * @description 支付宝正扫支付及支付宝JS支付参考该demo
 */
public class A_JSAPITest {
    public static void main(String[] args) throws Exception {
        A_JSAPI();
    }
    public static void A_JSAPI() throws Exception{

        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109111111"); // 商户号
        request.setGoodsDesc("上海合力批发站（货款）");// 商品描述
        request.setTransAmt("20.00"); // 交易金额
        request.setRemark("alipay:ID:102");//交易备注
// 设置超时时间
        request.setTimeExpire("20250916202931");
// 设置异步通知地址
        request.setNotifyUrl("https:/www.demoSite.com/api/public/hf/smstorecallback");
// 延迟交易能力 延迟入账标识
        request.setDelayAcctFlag("N");
// 实时分账能力 设置分账信息，需要分账权限
// request.setAcctSplitBunch("{\"acct_infos\":[{\"div_amt\":\"4.00\",\"huifu_id\":\"666600016871111\"}," +
// 						  "{\"div_amt\":\"16.00\",\"huifu_id\":\"6666000169391112\"}]}");

//以下为支付宝JS支付需要的参数
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        String aliDataString="";
        AlipayData alipayData = new AlipayData();
        alipayData.setBuyerId("2088111111111111");
//支付宝相关参数可参考官方文档 https://opendocs.alipay.com/mini/6039ed0c_alipay.trade.create?scene=de4d6a1e0c6e423b9eefa7c3a6dcb7a5&pathHash=779dc517
        aliDataString = objectMapper.writeValueAsString(alipayData);
        request.setTradeType("A_JSAPI"); // 交易类型 - 支付宝js
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", objectMapper.writeValueAsString(aliDataString)).create(request);
        System.out.println("A_JSAPI返回数据:" + JacksonUtils.convert2JsonString(response));
    }



}
