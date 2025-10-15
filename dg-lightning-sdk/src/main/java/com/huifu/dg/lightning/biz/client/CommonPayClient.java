package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayClosequeryRequest;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayCloseRequest;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayQueryRequest;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundQueryRequest;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class CommonPayClient extends BasePayClient {


    public CommonPayClient() {
    }

    public Map<String, Object> create(TradePaymentCreateRequest aggregateTransRequest) throws Exception {
        return request(aggregateTransRequest);
    }

    public Map<String, Object> query(TradePaymentScanpayQueryRequest scanpayQueryRequest) throws Exception {
        return request(scanpayQueryRequest);
    }

    public Map<String, Object> close(TradePaymentScanpayCloseRequest scanpayCloseRequest) throws Exception {
        return request(scanpayCloseRequest);
    }

    public Map<String, Object> closeQuery(TradePaymentScanpayClosequeryRequest scanpayCloseQueryRequest) throws Exception {
        return request(scanpayCloseQueryRequest);
    }

    public Map<String, Object> refund(TradePaymentScanpayRefundRequest scanpayRefundRequest) throws Exception {
        return request(scanpayRefundRequest);
    }

    public Map<String, Object> refundQuery(TradePaymentScanpayRefundQueryRequest scanpayRefundQueryRequest) throws Exception {
        return request(scanpayRefundQueryRequest);
    }


    public CommonPayClient optional(String key, Object value) {
        this.injectBizParam(key, value);
        return this;
    }


}
