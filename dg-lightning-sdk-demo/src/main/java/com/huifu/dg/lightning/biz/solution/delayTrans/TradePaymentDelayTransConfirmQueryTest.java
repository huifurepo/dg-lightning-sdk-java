package com.huifu.dg.lightning.biz.solution.delayTrans;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.solution.delayTrans.TradePaymentDelayTransConfirmQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;

import java.util.Map;

/**
 * @description: 交易确认查询
 * @author: wang.hu_c
 * @date: 2025年08月27日
 */
public class TradePaymentDelayTransConfirmQueryTest {
    public static void payConfirmQuery() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_INNER_TEST));
        // 2. 组装交易确认查询参数
        TradePaymentDelayTransConfirmQueryRequest request =new TradePaymentDelayTransConfirmQueryRequest();
        //商户号
        request.setHuifuId("6666000003100615");
        //原交易请求日期
        request.setOrgReqDate("20250815");
        //原交易请求流水号
        request.setOrgReqSeqId("9452943574111883");
        //是否垫资退款
        Map<String, Object> response = Factory.Solution.DelayTrans().confirmQuery(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));

    }

    public static void main(String[] args) throws Exception {
        payConfirmQuery();
    }
}
