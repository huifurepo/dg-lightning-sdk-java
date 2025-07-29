package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.PaymentRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class CommonPayClient2 extends BasePayClient {


    public CommonPayClient2() {
    }

    public   Map<String, Object> create(PaymentRequest paymentRequest)throws Exception {
        return this.request(paymentRequest,"test");
    }

    public CommonPayClient2 optional(String key, Object value){
        this.injectBizParam(key, value);
        return this;
    }


}
