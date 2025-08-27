package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description:
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class ScanpayQueryResponse implements Serializable {
    /**
     * /**
     * 结算金额
     */
    @JsonProperty("settlement_amt")
    private String settlementAmt;

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
     * 商户号
     */
    @JsonProperty("acct_id")
    private String acctId;
    /**
     * 机构请求流水号
     */
    @JsonProperty("req_date")
    private String reqDate;
    /**
     *原机构请求流水号
     */
    @JsonProperty("req_seq_id")
    private String reqSeqId;
    /**
     *交易返回的全局流水号
     */
    @JsonProperty("hf_seq_id")
    private String hfSeqId;
    /**
     * 交易类型
     */
    @JsonProperty("trade_type")
    private String tradeType;
    /**
     * 交易金额
     */
    @JsonProperty("trans_amt")
    private String transAmt;
    /**
     * 分账对象
     */
    @JsonProperty("acct_split_bunch")
    private String acctSplitBunch;
    /**
     * 延时标记
     */
    @JsonProperty("delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 备注/商户私有域
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 外部通道返回码
     */
    @JsonProperty("bank_code")
    private String bankCode;
    /**
     * 外部通道返回描述
     */
    @JsonProperty("bank_message")
    private String bankMessage;

    /**
     * 交易状态
     */
    @JsonProperty("trans_stat")
    private String transStat;
    /**
     * 账务状态 I：初始、P：处理中、S：成功、F：失败
     */
    @JsonProperty("acct_stat")
    private String acctStat;
    /**
     * 微信支付宝订单号
     */
    @JsonProperty("out_trans_id")
    private String outTransId;
    /**
     * 支付凭证号
     */
    @JsonProperty("party_order_id")
    private String partyOrderId;
    /**
     * 支付完成实际
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * 借贷记标识 D-借记卡，C-信用卡,Z-借贷合一卡
     */
    @JsonProperty("debit_type")
    private String debitType;
    /**
     * 是否分账交易
     */
    @JsonProperty("div_flag")
    private String divFlag;
    /**
     * 账务日期
     */
    @JsonProperty("acct_date")
    private String acctDate;
    /**
     * 微信用户唯一标识码
     */
    @JsonProperty("wx_user_id")
    private String wxUserId;
    /**
     * 待确认金额
     */
    @JsonProperty("unconfirm_amt")
    private String unconfirmAmt;
    /**
     * 终端类型
     */
    @JsonProperty("device_type")
    private String deviceType;
    /**
     * 手续费商户号
     */
    @JsonProperty("atu_sub_mer_id")
    private String atuSubMerId;
    /**
     * 交易扩展参数
     */
    @JsonProperty("method_expand")
    private String methodExpand;
    /**
     * 手续费对象
     */
    @JsonProperty("payment_fee")
    private String paymentFee;
    /**
     * 资金冻结状态
     */
    @JsonProperty("fund_freeze_stat")
    private String fundFreezeStat;
    /**
     * 冻结金额
     */
    @JsonProperty("unfreeze_amt")
    private String unfreezeAmt;
    /**
     * 冻结时间
     */
    @JsonProperty("freeze_time")
    private String freezeTime;
    /**
     * 解冻时间
     */
    @JsonProperty("unfreeze_time")
    private String unfreezeTime;

    public String getSettlementAmt() {
        return settlementAmt;
    }

    public void setSettlementAmt(String settlementAmt) {
        this.settlementAmt = settlementAmt;
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

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
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

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getDelayAcctFlag() {
        return delayAcctFlag;
    }

    public void setDelayAcctFlag(String delayAcctFlag) {
        this.delayAcctFlag = delayAcctFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankMessage() {
        return bankMessage;
    }

    public void setBankMessage(String bankMessage) {
        this.bankMessage = bankMessage;
    }

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }

    public String getAcctStat() {
        return acctStat;
    }

    public void setAcctStat(String acctStat) {
        this.acctStat = acctStat;
    }

    public String getOutTransId() {
        return outTransId;
    }

    public void setOutTransId(String outTransId) {
        this.outTransId = outTransId;
    }

    public String getPartyOrderId() {
        return partyOrderId;
    }

    public void setPartyOrderId(String partyOrderId) {
        this.partyOrderId = partyOrderId;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDebitType() {
        return debitType;
    }

    public void setDebitType(String debitType) {
        this.debitType = debitType;
    }

    public String getDivFlag() {
        return divFlag;
    }

    public void setDivFlag(String divFlag) {
        this.divFlag = divFlag;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate;
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId;
    }

    public String getUnconfirmAmt() {
        return unconfirmAmt;
    }

    public void setUnconfirmAmt(String unconfirmAmt) {
        this.unconfirmAmt = unconfirmAmt;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getAtuSubMerId() {
        return atuSubMerId;
    }

    public void setAtuSubMerId(String atuSubMerId) {
        this.atuSubMerId = atuSubMerId;
    }

    public String getMethodExpand() {
        return methodExpand;
    }

    public void setMethodExpand(String methodExpand) {
        this.methodExpand = methodExpand;
    }

    public String getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(String paymentFee) {
        this.paymentFee = paymentFee;
    }

    public String getFundFreezeStat() {
        return fundFreezeStat;
    }

    public void setFundFreezeStat(String fundFreezeStat) {
        this.fundFreezeStat = fundFreezeStat;
    }

    public String getUnfreezeAmt() {
        return unfreezeAmt;
    }

    public void setUnfreezeAmt(String unfreezeAmt) {
        this.unfreezeAmt = unfreezeAmt;
    }

    public String getFreezeTime() {
        return freezeTime;
    }

    public void setFreezeTime(String freezeTime) {
        this.freezeTime = freezeTime;
    }

    public String getUnfreezeTime() {
        return unfreezeTime;
    }

    public void setUnfreezeTime(String unfreezeTime) {
        this.unfreezeTime = unfreezeTime;
    }
}
