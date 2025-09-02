package com.huifu.dg.lightning.biz.commonPay;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;

import java.util.Map;

/**
 * @description: 扫码交易退款查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentScanpayRefundQueryTest {

    public static void scanpayRefundQuery() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayRefundQueryRequest request = new TradePaymentScanpayRefundQueryRequest();
        // 商户号
        request.setHuifuId("6666000103334211");
        request.setMerOrdId("2025082610443155900102tt");
        Map<String, Object> response = Factory.Payment.Common().refundQuery(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    public static void main(String[] args) throws Exception {
        scanpayRefundQuery();
    }
}
