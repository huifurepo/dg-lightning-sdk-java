package com.huifu.dg.lightning.biz.commonPay;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayClosequeryRequest;
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
        TradePaymentScanpayClosequeryRequest request = new TradePaymentScanpayClosequeryRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000003141435");
        request.setOrgReqDate("20210916");
        request.setOrgReqSeqId("20210916165555E35877");
        request.setOrgHfSeqId("0036000topA210916165555P153c0a8559500000");
        Map<String, Object> response = Factory.Payment.Common().closeQuery(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    public static void main(String[] args) throws Exception {
        transClose();
    }
}
