package com.huifu.dg.lightning.biz.payment.create;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.UnionpayData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;

import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/13 11:23
 * @description 银联JS支付demo
 */
public class U_JSAPITest {
    public static void main(String[] args) throws Exception {
        U_JSAPI();
    }
    public static void U_JSAPI() throws Exception{

        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_PROD));
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("hibs自动化-通用版验证");// 商品描述
        request.setTransAmt("0.05"); // 交易金额
        request.setRemark("alipay:ID:102");//交易备注
// 设置超时时间
//        request.setTimeExpire("20250916202931");
// 设置异步通知地址
        request.setNotifyUrl("https://www.demoSite.com/api/public/hf/smstorecallback");
// 延迟交易能力 延迟入账标识
        request.setDelayAcctFlag("N");
        request.setTerminalDeviceData("{\"deviceIp\":\"221.11.52.52\",\"merDeviceType\":\"11\"}");

// 实时分账能力 设置分账信息，需要分账权限
// request.setAcctSplitBunch("{\"acct_infos\":[{\"div_amt\":\"4.00\",\"huifu_id\":\"666600016871111\"}," +
// 						  "{\"div_amt\":\"16.00\",\"huifu_id\":\"6666000169391112\"}]}");

//以下为支付宝JS支付需要的参数
        String unionPayDataString="";
        UnionpayData unionpayData = new UnionpayData();
        unionpayData.setQrCode("union-542323asdas12351111");
        unionpayData.setUserId("union4f4f5a5f5a5f5a11");

        unionPayDataString = JSON.toJSONString(unionpayData);
        request.setTradeType("U_JSAPI");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", unionPayDataString).create(request);
        System.out.println("U_JSAPI返回数据:" + JSON.toJSONString(response));
    }




}
