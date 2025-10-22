package com.huifu.dg.lightning.biz.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @description: 扫码交易查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentScanpayQueryTest {
    public static void transQueryPord() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_PROD));
        TradePaymentScanpayQueryRequest request = new TradePaymentScanpayQueryRequest();
        // 请求日期
        request.setReqDate("20251017");
        // 商户号
        request.setHuifuId("6666000109133323");
        request.setHfSeqId("002900TOP2A251017152703P414ac139c4a00000");//请求的HF订单序列号
        Map<String, Object> response = Factory.Payment.Common().query(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    public static void main(String[] args) throws Exception {
        transQueryPord();
    }
}
