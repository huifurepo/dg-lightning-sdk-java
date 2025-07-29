package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.PaymentRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class CommonPayClient extends BasePayClient {




    public static Map<String, Object> create(PaymentRequest paymentRequest)throws Exception {
        return BasePayClient.request(paymentRequest);
    }


}
