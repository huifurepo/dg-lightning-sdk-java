package com.huifu.dg.lightning.models.payment;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description:
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class TradePaymentScanpayQueryResponse implements Serializable {
    /**
     * /**
     * 结算金额
     */
    @JSONField(name = "settlement_amt")
    private String settlementAmt;

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 商户号
     */
    @JSONField(name = "acct_id")
    private String acctId;
    /**
     * 机构请求流水号
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     *原机构请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     *交易返回的全局流水号
     */
    @JSONField(name = "hf_seq_id")
    private String hfSeqId;
    /**
     * 交易类型
     */
    @JSONField(name = "trade_type")
    private String tradeType;
    /**
     * 交易金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private String acctSplitBunch;
    /**
     * 延时标记
     */
    @JSONField(name = "delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 备注/商户私有域
     */
    @JSONField(name = "remark")
    private String remark;
    /**
     * 外部通道返回码
     */
    @JSONField(name = "bank_code")
    private String bankCode;
    /**
     * 外部通道返回描述
     */
    @JSONField(name = "bank_message")
    private String bankMessage;

    /**
     * 交易状态
     */
    @JSONField(name = "trans_stat")
    private String transStat;
    /**
     * 账务状态 I：初始、P：处理中、S：成功、F：失败
     */
    @JSONField(name = "acct_stat")
    private String acctStat;
    /**
     * 微信支付宝订单号
     */
    @JSONField(name = "out_trans_id")
    private String outTransId;
    /**
     * 支付凭证号
     */
    @JSONField(name = "party_order_id")
    private String partyOrderId;
    /**
     * 支付完成实际
     */
    @JSONField(name = "end_time")
    private String endTime;
    /**
     * 借贷记标识 D-借记卡，C-信用卡,Z-借贷合一卡
     */
    @JSONField(name = "debit_type")
    private String debitType;
    /**
     * 账务日期
     */
    @JSONField(name = "acct_date")
    private String acctDate;
    /**
     * 微信用户唯一标识码
     */
    @JSONField(name = "wx_user_id")
    private String wxUserId;
    /**
     * 待确认金额
     */
    @JSONField(name = "unconfirm_amt")
    private String unconfirmAmt;
    /**
     * 终端类型
     */
    @JSONField(name = "device_type")
    private String deviceType;
    /**
     * 手续费商户号
     */
    @JSONField(name = "atu_sub_mer_id")
    private String atuSubMerId;
    /**
     * 交易扩展参数
     */
    @JSONField(name = "method_expand")
    private String methodExpand;
    /**
     * 手续费对象
     */
    @JSONField(name = "payment_fee")
    private String paymentFee;
    /**
     * 资金冻结状态
     */
    @JSONField(name = "fund_freeze_stat")
    private String fundFreezeStat;
    /**
     * 冻结金额
     */
    @JSONField(name = "unfreeze_amt")
    private String unfreezeAmt;
    /**
     * 冻结时间
     */
    @JSONField(name = "freeze_time")
    private String freezeTime;
    /**
     * 解冻时间
     */
    @JSONField(name = "unfreeze_time")
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
