package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.AggregateTransRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class CommonPayClient extends BasePayClient {




    public static Map<String, Object> create(AggregateTransRequest aggregateTransRequest)throws Exception {
        return BasePayClient.request(aggregateTransRequest);
    }


}
