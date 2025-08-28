package com.huifu.dg.lightning.biz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.ScanpayRefundRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @description: 扫码交易退款
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class ScanpayTransRefundTest {
    public static void transRefund() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        ScanpayRefundRequest request = new ScanpayRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000103334211");
        request.setOrgReqDate("20250826");
        request.setOrgReqSeqId("2025082610443155900102");
        Map<String, Object> response = Factory.Payment.Common().refund(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    public static void main(String[] args) throws Exception {
        transRefund();
    }
}
