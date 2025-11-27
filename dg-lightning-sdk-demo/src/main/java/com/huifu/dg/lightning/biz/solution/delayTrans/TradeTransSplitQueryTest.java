package com.huifu.dg.lightning.biz.solution.delayTrans;

import com.alibaba.fastjson.JSONObject;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.solution.delayTrans.TradeTransSplitQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;


import java.util.Map;

/**
 * @description: 交易分账明细查询
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradeTransSplitQueryTest {

    public static void transSplitQuery() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_INNER_TEST));
        // 2. 组装交易分账明细查询参数
        TradeTransSplitQueryRequest request =new TradeTransSplitQueryRequest();
        //商户号
        //request.setHuifuId("6666000103423237");
        //原交易请求日期
        request.setHfSeqId("00190000000211021184941P7160a40080800000");
        //原交易请求流水号
        request.setOrdType("refund");
        //是否垫资退款
        Map<String, Object> response = Factory.Solution.DelayTrans().splitQuery(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));

    }

    public static void main(String[] args) throws Exception {
        transSplitQuery();
    }
}
