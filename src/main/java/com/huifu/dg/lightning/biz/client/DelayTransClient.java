package com.huifu.dg.lightning.biz.client;

import com.huifu.dg.lightning.models.ConfirmQueryRequest;
import com.huifu.dg.lightning.models.ConfirmRefundQueryRequest;
import com.huifu.dg.lightning.models.DelayTransConfirmRequest;
import com.huifu.dg.lightning.models.PayConfirmRefundRequest;
import com.huifu.dg.lightning.models.TransSplitQueryRequest;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/7/24 14:24
 * @description
 */
public class DelayTransClient extends BasePayClient {


    public DelayTransClient() {
    }

    public Map<String, Object> confirm(DelayTransConfirmRequest delayTransConfirmRequest) throws Exception {
        return request(delayTransConfirmRequest);
    }

    public Map<String, Object> confirmQuery(ConfirmQueryRequest confirmQueryRequest) throws Exception {
        return request(confirmQueryRequest);
    }


    public Map<String, Object> refund(PayConfirmRefundRequest payConfirmRefundRequest) throws Exception {
        return request(payConfirmRefundRequest);
    }

    public Map<String, Object> refundQuery(ConfirmRefundQueryRequest confirmRefundQueryRequest) throws Exception {
        return request(confirmRefundQueryRequest);
    }

    public Map<String, Object> splitQuery(TransSplitQueryRequest transSplitQueryRequest) throws Exception {
        return request(transSplitQueryRequest);
    }


    public DelayTransClient optional(String key, Object value) {
        this.injectBizParam(key, value);
        return this;
    }


}
