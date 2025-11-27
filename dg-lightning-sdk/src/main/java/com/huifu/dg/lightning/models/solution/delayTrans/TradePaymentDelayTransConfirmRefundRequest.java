package com.huifu.dg.lightning.models.solution.delayTrans;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.BaseRequest;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 交易确认退款
 * @author: wang.hu_c
 * @date: 2025年08月25日
 */
public class TradePaymentDelayTransConfirmRefundRequest extends BaseRequest {
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
     * 原交易请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原交易请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private String acctSplitBunch;
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
    /**
     * 备注
     */
    @JSONField(name = "remark")
    private String remark;

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

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMREFUND;
    }
}
