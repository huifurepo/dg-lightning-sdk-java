package com.huifu.dg.lightning.biz.payment.create;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.WxData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/13 10:40
 * @description微信公众号支付demo
 */
public class T_JSAPITest {

    public static void main(String[] args) throws Exception {
        T_JSAPI();
    }

    public static void T_JSAPI() throws Exception{
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

//以下为微信公众号支付需要的参数
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        String wxDataString="";
// {"sub_appid":"wxa350b4c0fd003192","sub_openid":"o4n3E6q8MOEQefCsGKVOAh40spNw"}
        WxData wxData = new WxData();
        wxData.setSubOpenid("o8jhotzittQSeFF-N0Yj4Hz91Rqc");
        wxData.setSubAppid("wx4f4f5a5f5a5f5aFF");
        wxDataString = objectMapper.writeValueAsString(wxData);
        request.setTradeType("T_JSAPI"); // 交易类型 - 微信公众号支付
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", objectMapper.writeValueAsString(wxDataString)).create(request);
        System.out.println("T_JSAPI返回数据:" + JacksonUtils.convert2JsonString(response));
    }

}
