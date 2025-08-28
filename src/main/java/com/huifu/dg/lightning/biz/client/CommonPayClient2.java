package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.AggregateTransRequest;
import com.huifu.dg.lightning.models.ScanpayCloseRequest;
import com.huifu.dg.lightning.models.ScanpayQueryRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class CommonPayClient2 extends BasePayClient {


    public CommonPayClient2() {
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

    public CommonPayClient2 optional(String key, Object value){
        this.injectBizParam(key, value);
        return this;
    }


}
