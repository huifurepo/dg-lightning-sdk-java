package com.huifu.dg.lightning.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

public class DelayTransConfirmRequest extends BaseRequest {
    @JsonProperty("req_seq_id")
    private String reqSeqId;

    @JsonProperty("req_date")
    private String reqDate;

    @JsonProperty("huifu_id")
    private String huifuId;

    @JsonProperty("org_req_seq_id")
    private String orgReqSeqId;

    @JsonProperty("org_req_date")
    private String orgReqDate;

    @JsonProperty("org_hf_seq_id")
    private String orgHfSeqId;

    @JsonProperty("acct_split_bunch")
    private String acctSplitBunch;

    @JsonProperty("risk_check_data")
    private String riskCheckData;

    @JsonProperty("pay_type")
    private String payType;

    @JsonProperty("remark")
    private String remark;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_DELAYTRANS_CONFIRM;
    }


    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
