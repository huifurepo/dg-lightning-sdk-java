package com.huifu.dg.lightning.biz;

import com.huifu.dg.lightning.biz.client.CommonPayClient;
import com.huifu.dg.lightning.models.PaymentRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 15:31
 * @description
 */
public class DemoTest {

    public void test() throws Exception{

        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setReqSeqId("12");
        paymentRequest.setHuifuId("6660343453");
        paymentRequest.setTradeType("scan");
        paymentRequest.optional("seller","zhangsan");
        Map<String, Object> map = CommonPayClient.create(paymentRequest);
    }

}
