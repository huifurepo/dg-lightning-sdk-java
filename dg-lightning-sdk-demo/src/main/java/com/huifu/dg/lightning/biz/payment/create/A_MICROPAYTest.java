package com.huifu.dg.lightning.biz.payment.create;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AlipayData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/13 11:23
 * @description 支付宝付款码demo
 */
public class A_MICROPAYTest {
    public static void main(String[] args) throws Exception {
        A_MICROPAY();
    }
    public static void A_MICROPAY() throws Exception{

        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_INNER_TEST));
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109111111"); // 商户号
        request.setGoodsDesc("上海合力批发站");// 商品描述
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
// {"openId":"ow-Xw5prGjuQlh6xjeOjY1ne2ks8"}"
        AlipayData alipayData = new AlipayData();
        alipayData.setBuyerId("2088111111111111");
//付款码必传终端信息 TerminalDeviceData 对象
        request.setTerminalDeviceData("{\"deviceIp\":\"172.28.52.52\",\"merDeviceType\":\"11\",\"devsId\":\"SPINTP351420900692801\"}");
        wxDataString = objectMapper.writeValueAsString(alipayData);
        request.setTradeType("A_MICROPAY"); // 交易类型
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", objectMapper.writeValueAsString(wxDataString)).create(request);
        System.out.println("A_MICROPAY返回数据:" + JacksonUtils.convert2JsonString(response));
    }



}
