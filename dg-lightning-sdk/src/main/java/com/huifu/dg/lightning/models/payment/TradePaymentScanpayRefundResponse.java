package com.huifu.dg.lightning.models.payment;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.AcctSplitBunch;
import com.huifu.dg.lightning.models.SplitFeeInfo;

import java.io.Serializable;

/**
 * @description: 退款对象
 * @author: wang.hu_c
 * @date: 2025年08月22日
 */
public class TradePaymentScanpayRefundResponse implements Serializable {
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 退款全局流水号
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 退款请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 退款请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 退款金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 实际退款金额
     */
    @JSONField(name = "actual_ref_amt")
    private String actualRefAmt;
    /**
     * 交易发生日期
     */
    @JSONField(name = "trans_date")
    private String transDate;
    /**
     * 交易发生时间
     */
    @JSONField(name = "trans_time")
    private String transTime;
    /**
     * 交易类型
     */
    @JSONField(name = "trans_type")
    private String transType;
    /**
     * 交易状态
     */
    @JSONField(name = "trans_stat")
    private String transStat;
    /**
     * 通道返回描述
     */
    @JSONField(name = "bank_message")
    private String bankMessage;
    /**
     * 手续费金额
     */
    @JSONField(name = "fee_amt")
    private String feeAmt;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;
    /**
     * 分账手续费信息
     */
    @JSONField(name = "split_fee_info")
    private SplitFeeInfo splitFeeInfo;
    /**
     * 备注
     */
    @JSONField(name = "remark")
    private String remark;

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
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

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

    public String getActualRefAmt() {
        return actualRefAmt;
    }

    public void setActualRefAmt(String actualRefAmt) {
        this.actualRefAmt = actualRefAmt;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }

    public String getBankMessage() {
        return bankMessage;
    }

    public void setBankMessage(String bankMessage) {
        this.bankMessage = bankMessage;
    }

    public String getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(String feeAmt) {
        this.feeAmt = feeAmt;
    }

    public AcctSplitBunch getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(AcctSplitBunch acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public SplitFeeInfo getSplitFeeInfo() {
        return splitFeeInfo;
    }

    public void setSplitFeeInfo(SplitFeeInfo splitFeeInfo) {
        this.splitFeeInfo = splitFeeInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
