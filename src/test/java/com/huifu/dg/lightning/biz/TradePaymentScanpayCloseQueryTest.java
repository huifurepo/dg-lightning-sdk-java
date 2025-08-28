package com.huifu.dg.lightning.biz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.client.BasePayClient;
import com.huifu.dg.lightning.models.ScanpayCloseRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @description: 扫码交易关单查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentScanpayCloseQueryTest {
    public static void transClose() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        ScanpayCloseRequest request = new ScanpayCloseRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000003100616");
        request.setOrgReqDate("20200422");
        request.setOrgReqSeqId("1399999561616618");
        Map<String, Object> response = BasePayClient.request(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    public static void main(String[] args) throws Exception {
        transClose();
    }
}
