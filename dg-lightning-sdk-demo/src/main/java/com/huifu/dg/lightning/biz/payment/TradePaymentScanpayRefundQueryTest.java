package com.huifu.dg.lightning.biz.payment;

import com.alibaba.fastjson.JSONObject;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;

import java.util.Map;

/**
 * @description: 扫码交易退款查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentScanpayRefundQueryTest {

    public static void scanpayRefundQuery() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_INNER_TEST));
        TradePaymentScanpayRefundQueryRequest request = new TradePaymentScanpayRefundQueryRequest();
        // 商户号
        request.setHuifuId("6666000103334211");
        request.setMerOrdId("2025082610443155900102tt");
        Map<String, Object> response = Factory.Payment.Common().refundQuery(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    public static void main(String[] args) throws Exception {
        scanpayRefundQuery();
    }
}
