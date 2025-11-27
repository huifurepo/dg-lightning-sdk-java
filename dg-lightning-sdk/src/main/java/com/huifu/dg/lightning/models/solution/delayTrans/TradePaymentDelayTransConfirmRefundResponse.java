package com.huifu.dg.lightning.models.solution.delayTrans;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.AcctSplitBunch;

import java.io.Serializable;

/**
 * @description: 交易确认退款返回参数
 * @author: wang.hu_c
 * @date: 2025年08月25日
 */
public class TradePaymentDelayTransConfirmRefundResponse implements Serializable {
    /**
     * 业务响应码
     */
    @JSONField(name = "resp_code")
    private String respCode;
    /**
     * 业务响应信息
     */
    @JSONField(name = "resp_desc")
    private String respDesc;
    /**
     * 交易状态
     */
    @JSONField(name = "trans_stat")
    private String transStat;
    /**
     * 全局流水号
     */
    @JSONField(name = "hf_seq_id")
    private String hfSeqId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原交易请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 待确认总金额
     */
    @JSONField(name = "unconfirm_amt")
    private String unconfirmAmt;
    /**
     * 已确认总金额
     */
    @JSONField(name = "confirmed_amt")
    private String confirmedAmt;
    /**
     * 支付交易业务请求时间
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 支付交易汇付全局流水号
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;
    /**
     * 备注
     */
    @JSONField(name = "remark")
    private String remark;
    /**
     * 是否垫资退款
     */
    @JSONField(name = "loan_flag")
    private String loanFlag;
    /**
     * 垫资承担者
     */
    @JSONField(name = "loan_undertaker")
    private String loanUndertaker;
    /**
     * 垫资账户类型
     */
    @JSONField(name = "loan_acct_type")
    private String loanAcctType;

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

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
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

    public String getUnconfirmAmt() {
        return unconfirmAmt;
    }

    public void setUnconfirmAmt(String unconfirmAmt) {
        this.unconfirmAmt = unconfirmAmt;
    }

    public String getConfirmedAmt() {
        return confirmedAmt;
    }

    public void setConfirmedAmt(String confirmedAmt) {
        this.confirmedAmt = confirmedAmt;
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
