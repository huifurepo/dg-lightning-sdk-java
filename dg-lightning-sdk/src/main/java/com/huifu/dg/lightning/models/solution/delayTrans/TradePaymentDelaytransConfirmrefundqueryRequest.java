package com.huifu.dg.lightning.models.solution.delayTrans;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.BaseRequest;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 交易确认退款查询
 * @author: wang.hu_c
 * @date: 2025年08月25日
 */
public class TradePaymentDelaytransConfirmrefundqueryRequest extends BaseRequest {
    /**
     * 原机构请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原机构请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原交易确认退款全局流水号
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;

    @JSONField(name = "huifu_id")
    private String huifuId;

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMREFUNDQUERY;
    }
}
