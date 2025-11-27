package com.huifu.dg.lightning.biz.payment.create;

import com.alibaba.fastjson.JSON;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AlipayData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
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

        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_PROD));
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("hibs自动化-通用版验证");// 商品描述
        request.setTransAmt("0.05"); // 交易金额
        request.setRemark("JSPAY:ID:102");//交易备注
// 设置超时时间
//        request.setTimeExpire("20251118202931");
// 设置异步通知地址
        request.setNotifyUrl("https://www.demoSite.com/api/smstorecallback");
// 延迟交易能力 延迟入账标识
        request.setDelayAcctFlag("N");
// 实时分账能力 设置分账信息，需要分账权限
// request.setAcctSplitBunch("{\"acct_infos\":[{\"div_amt\":\"4.00\",\"huifu_id\":\"666600016871111\"}," +
// 						  "{\"div_amt\":\"16.00\",\"huifu_id\":\"6666000169391112\"}]}");

//以下为微信小程序需要的参数
        String dataString="";
        AlipayData alipayData = new AlipayData();
        alipayData.setBuyerId("2088111111111111");
        alipayData.setAuthCode("2884138408701518074");
//付款码必传终端信息 TerminalDeviceData 对象
        request.setTerminalDeviceData("{\"deviceIp\":\"172.28.52.52\",\"merDeviceType\":\"11\",\"devsId\":\"SPINTP351420900692801\"}");
        dataString = JSON.toJSONString(alipayData);
        request.setTradeType("A_MICROPAY"); // 交易类型
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", dataString).create(request);
        System.out.println("A_MICROPAY返回数据:" + JSON.toJSONString(response));
    }



}
