package com.huifu.dg.lightning.biz;

import com.huifu.dg.lightning.biz.client.CommonPayClient;
import com.huifu.dg.lightning.models.AggregateTransRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 15:31
 * @description
 */
public class DemoTest {

    public void test() throws Exception{

        AggregateTransRequest aggregateTransRequest = new AggregateTransRequest();
        aggregateTransRequest.setReqSeqId("12");
        aggregateTransRequest.setHuifuId("6660343453");
        aggregateTransRequest.setTradeType("scan");
        aggregateTransRequest.optional("seller","zhangsan");
        Map<String, Object> map = CommonPayClient.create(aggregateTransRequest);
    }

}
