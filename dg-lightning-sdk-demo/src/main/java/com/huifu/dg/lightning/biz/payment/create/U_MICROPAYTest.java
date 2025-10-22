package com.huifu.dg.lightning.biz.payment.create;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.UnionpayData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/13 11:23
 * @description
 */
public class U_MICROPAYTest {
    public static void main(String[] args) throws Exception {
        U_NATIVE();
    }
    public static void U_NATIVE() throws Exception{

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
        String unionPayDataString="";
        UnionpayData unionpayData = new UnionpayData();
        unionpayData.setQrCode("union-542323asdas12351111");
        unionpayData.setUserId("union4f4f5a5f5a5f5111");
//付款码必传终端信息 TerminalDeviceData 对象
        request.setTerminalDeviceData("{\"deviceIp\":\"221.11.52.52\",\"merDeviceType\":\"11\",\"devsId\":\"SPINTP35142090061111\"}");
        unionPayDataString = objectMapper.writeValueAsString(unionpayData);
        request.setTradeType("U_MICROPAY"); // 交易类型
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", objectMapper.writeValueAsString(unionPayDataString)).create(request);
        System.out.println("U_MICROPAY返回数据:" + JacksonUtils.convert2JsonString(response));
    }





}
