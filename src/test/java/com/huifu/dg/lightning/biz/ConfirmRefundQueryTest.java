package com.huifu.dg.lightning.biz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.ConfirmRefundQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;

import java.util.Map;

/**
 * @description: 交易确认退款查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class ConfirmRefundQueryTest {
    public static void confirmRefundQuery() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        // 2. 组装交易确认退款查询参数
        ConfirmRefundQueryRequest request =new ConfirmRefundQueryRequest();
        //商户号
        request.setHuifuId("6666000103423237");
        //原交易请求日期
        request.setOrgReqDate("20230711");
        //原交易请求流水号
        request.setOrgReqSeqId("2361874342747312");
        //是否垫资退款
        Map<String, Object> response = Factory.Solution.DelayTrans().refundQuery(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));

    }

    public static void main(String[] args) throws Exception {
        confirmRefundQuery();
    }
}
