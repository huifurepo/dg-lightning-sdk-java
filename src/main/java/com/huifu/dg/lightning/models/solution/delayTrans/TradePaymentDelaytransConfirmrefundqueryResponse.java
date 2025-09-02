package com.huifu.dg.lightning.models.solution.delayTrans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.models.AcctSplitBunch;
import com.huifu.dg.lightning.models.PayConfirmAcctDetail;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 交易确认退款查询返回参数
 * @author: wang.hu_c
 * @date: 2025年08月25日
 */
public class TradePaymentDelaytransConfirmrefundqueryResponse implements Serializable {
    /**
     * 交易状态
     */
    @JsonProperty("trans_stat")
    private String transStat;

    /**
     * 原请求日期
     */
    @JsonProperty("org_req_date")
    private String orgReqDate;

    /**
     * 原请求流水号
     */
    @JsonProperty("org_req_seq_id")
    private String orgReqSeqId;

    /**
     * 原交易确认退款全局流水号
     */
    @JsonProperty("org_hf_seq_id")
    private String orgHfSeqId;

    /**
     * 业务响应码
     */
    @JsonProperty("resp_code")
    private String respCode;
    /**
     * 业务响应信息
     */

    @JsonProperty("resp_desc")
    private String respDesc;

    /**
     * 商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 交易确认帐务明细
     */
    @JsonProperty("pay_confirm_acct_details")
    private List<PayConfirmAcctDetail> payConfirmAcctDetails;

    /**
     * 交易确认帐务明细
     */
    @JsonProperty("acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;

    /**
     * 备注说明
     */
    @JsonProperty("remark")
    private String remark;

    @JsonProperty("loan_flag")
    private String loanFlag;

    /**
     * 垫资承担者: 为空: 各自承担, 不为空走第三方垫资
     */
    @JsonProperty("loan_undertaker")
    private String loanUndertaker;

    /**
     * 垫资账户类型: 01:基本户, 05: 充值户, 默认充值户
     */
    @JsonProperty("loan_acct_type")
    private String loanAcctType;

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }

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

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public List<PayConfirmAcctDetail> getPayConfirmAcctDetails() {
        return payConfirmAcctDetails;
    }

    public void setPayConfirmAcctDetails(List<PayConfirmAcctDetail> payConfirmAcctDetails) {
        this.payConfirmAcctDetails = payConfirmAcctDetails;
    }

    public AcctSplitBunch getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(AcctSplitBunch acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLoanFlag() {
        return loanFlag;
    }

    public void setLoanFlag(String loanFlag) {
        this.loanFlag = loanFlag;
    }

    public String getLoanUndertaker() {
        return loanUndertaker;
    }

    public void setLoanUndertaker(String loanUndertaker) {
        this.loanUndertaker = loanUndertaker;
    }

    public String getLoanAcctType() {
        return loanAcctType;
    }

    public void setLoanAcctType(String loanAcctType) {
        this.loanAcctType = loanAcctType;
    }
}
