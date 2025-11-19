package com.huifu.dg.lightning.biz.solution.delayTrans;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.MyJacksonUtils;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AcctInfo;
import com.huifu.dg.lightning.models.AcctSplitBunch;
import com.huifu.dg.lightning.models.solution.delayTrans.TradePaymentDelayTransConfirmRefundRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;

import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @description: 交易确认退款
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentDelayTransConfirmRefundTest {
    public static void payConfirmRefund() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_INNER_TEST));
        // 2. 组装交易确认退款参数
        TradePaymentDelayTransConfirmRefundRequest request =new TradePaymentDelayTransConfirmRefundRequest();
        //请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        //请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        //商户号
        request.setHuifuId("6666000103334211");
        //原交易请求日期
        request.setOrgReqDate("20250815");
        //原交易请求流水号
        request.setOrgReqSeqId("8964346835104851");
        //分账对象
        request.setAcctSplitBunch(getAcctSplitBunch());
        //是否垫资退款
        Map<String, Object> response = Factory.Solution.DelayTrans().refund(request);
        ObjectMapper objectMapper = MyJacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));

    }

    private static String getAcctSplitBunch() throws Exception{
        List<AcctInfo> acctInfos = new ArrayList<>();
        //分账串1
        AcctInfo acctInfo1 = new AcctInfo();
        acctInfo1.setDivAmt("5.00");
        acctInfo1.setHuifuId("6666000003100617");
        acctInfos.add(acctInfo1);
        //分账串2
        AcctInfo acctInfo2 = new AcctInfo();
        acctInfo2.setDivAmt("4.00");
        acctInfo2.setHuifuId("6666000003100618");
        acctInfos.add(acctInfo2);

        AcctSplitBunch acctSplitBunch = new AcctSplitBunch();
        acctSplitBunch.setAcctInfos(acctInfos);
        ObjectMapper objectMapper = MyJacksonUtils.getInstance();
        return objectMapper.writeValueAsString(acctSplitBunch);
    }

    public static void main(String[] args) throws Exception {
        payConfirmRefund();
    }
}
