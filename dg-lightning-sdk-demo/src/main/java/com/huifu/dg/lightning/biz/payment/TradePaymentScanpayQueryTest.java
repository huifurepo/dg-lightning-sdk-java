package com.huifu.dg.lightning.biz.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;

import java.util.Map;

/**
 * @description: 扫码交易查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentScanpayQueryTest {
    public static void transQuery() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayQueryRequest request = new TradePaymentScanpayQueryRequest();
        // 请求日期
        request.setReqDate("20250828");
        // 请求流水号
        request.setReqSeqId("20250828132840356820731tt");
        // 商户号
        request.setHuifuId("6666000109003271");
        request.setHfSeqId("0029000topB250828133310P205c0a840a900000");
        Map<String, Object> response = Factory.Payment.Common().query(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    public static void main(String[] args) throws Exception {
        transQuery();
    }
}
