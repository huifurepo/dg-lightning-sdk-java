package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.solution.delayTrans.TradePaymentDelayTransConfirmQueryRequest;
import com.huifu.dg.lightning.models.solution.delayTrans.TradePaymentDelaytransConfirmrefundqueryRequest;
import com.huifu.dg.lightning.models.solution.delayTrans.TradePaymentDelaytransConfirmRequest;
import com.huifu.dg.lightning.models.solution.delayTrans.TradePaymentDelayTransConfirmRefundRequest;
import com.huifu.dg.lightning.models.solution.delayTrans.TradeTransSplitQueryRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class DelayTransClient extends BasePayClient {


    public DelayTransClient() {
    }

    public Map<String, Object> confirm(TradePaymentDelaytransConfirmRequest delayTransConfirmRequest) throws Exception {
        return request(delayTransConfirmRequest);
    }

    public Map<String, Object> confirmQuery(TradePaymentDelayTransConfirmQueryRequest confirmQueryRequest) throws Exception {
        return request(confirmQueryRequest);
    }


    public Map<String, Object> refund(TradePaymentDelayTransConfirmRefundRequest payConfirmRefundRequest) throws Exception {
        return request(payConfirmRefundRequest);
    }

    public Map<String, Object> refundQuery(TradePaymentDelaytransConfirmrefundqueryRequest confirmRefundQueryRequest) throws Exception {
        return request(confirmRefundQueryRequest);
    }

    public Map<String, Object> splitQuery(TradeTransSplitQueryRequest transSplitQueryRequest) throws Exception {
        return request(transSplitQueryRequest);
    }


    public DelayTransClient optional(String key, Object value) {
        this.injectBizParam(key, value);
        return this;
    }


}
