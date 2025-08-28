package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.AggregateTransRequest;
import com.huifu.dg.lightning.models.ScanpayCloseQueryRequest;
import com.huifu.dg.lightning.models.ScanpayCloseRequest;
import com.huifu.dg.lightning.models.ScanpayQueryRequest;
import com.huifu.dg.lightning.models.ScanpayRefundQueryRequest;
import com.huifu.dg.lightning.models.ScanpayRefundRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class CommonPayClient extends BasePayClient {


    public CommonPayClient() {
    }

    public   Map<String, Object> create(AggregateTransRequest aggregateTransRequest)throws Exception {
        return request(aggregateTransRequest);
    }

    public   Map<String, Object> query(ScanpayQueryRequest scanpayQueryRequest)throws Exception {
        return request(scanpayQueryRequest);
    }

    public   Map<String, Object> close(ScanpayCloseRequest scanpayCloseRequest)throws Exception {
        return request(scanpayCloseRequest);
    }

    public   Map<String, Object> closeQuery(ScanpayCloseQueryRequest scanpayCloseQueryRequest)throws Exception {
        return request(scanpayCloseQueryRequest);
    }

    public   Map<String, Object> refund(ScanpayRefundRequest scanpayRefundRequest)throws Exception {
        return request(scanpayRefundRequest);
    }
    public   Map<String, Object> refundQuery(ScanpayRefundQueryRequest scanpayRefundQueryRequest)throws Exception {
        return request(scanpayRefundQueryRequest);
    }


    public CommonPayClient optional(String key, Object value){
        this.injectBizParam(key, value);
        return this;
    }


}
