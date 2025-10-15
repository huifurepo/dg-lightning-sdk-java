package com.huifu.dg.lightning.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.models.BaseResponse;

import java.io.Serializable;

/**
 * @description: 聚合下单返回对象
 * @author: wang.hu_c
 * @date: 2025年08月27日
 */
public class TradePaymentPayResponse extends BaseResponse implements Serializable {
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
     * 交易状态
     */
    @JsonProperty("trans_stat")
    private String transStat;
    /**
     * 是否延迟入账
     */
    @JsonProperty("delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 交易备注 商户私有域
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 设备类型。
     */
    @JsonProperty("device_type")
    private String deviceType;
    /**
     * 支付凭证号
     */
    @JsonProperty("party_order_id")
    private String partyOrderId;
    /**
     * 待确认金额
     */
    @JsonProperty("unconfirm_amt")
    private String unconfirmAmt;

    /**
     * 结算金额
     */
    @JsonProperty("settlement_amt")
    private String settlementAmt;

    /**
     * 微信支付宝订单号
     */
    @JsonProperty("out_trans_id")
    private String outTransId;
    /**
     * 账务状态
     */
    @JsonProperty("acct_stat")
    private String acctStat;
    /**
     * 外部通道返回码
     */
    @JsonProperty("bank_code")
    private String bankCode;

    /**
     * 通道返回描述
     */
    @JsonProperty("bank_message")
    private String bankMessage;

    /**
     * 支付完成时间
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * 借贷标识
     */
    @JsonProperty("debit_type")
    private String debitType;

    /**
     * 微信用户唯一标识码
     */
    @JsonProperty("wx_user_id")
    private String wxUserId;

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
     * 二维码链接
     */
    @JsonProperty("qr_code")
    private String qrCode;
    /**
     * js支付信息
     */
    @JsonProperty("pay_info")
    private String payInfo;
    /**
     * 手续费对象
     */
    @JsonProperty("payment_fee")
    private String paymentFee;
    /**
     * 补贴支付信息
     */
    @JsonProperty("combinedpay_data")
    private String combinedpayData;

    /**
     * 补贴支付手续费承担方信息
     */
    @JsonProperty("combinedpay_data_fee_info")
    private String combinedpayDataFeeInfo;

    /**
     * 手续费补贴信息
     */
    @JsonProperty("trans_fee_allowance_info")
    private String transFeeAllowanceInfo;

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

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
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

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getPartyOrderId() {
        return partyOrderId;
    }

    public void setPartyOrderId(String partyOrderId) {
        this.partyOrderId = partyOrderId;
    }

    public String getUnconfirmAmt() {
        return unconfirmAmt;
    }

    public void setUnconfirmAmt(String unconfirmAmt) {
        this.unconfirmAmt = unconfirmAmt;
    }

    public String getSettlementAmt() {
        return settlementAmt;
    }

    public void setSettlementAmt(String settlementAmt) {
        this.settlementAmt = settlementAmt;
    }

    public String getOutTransId() {
        return outTransId;
    }

    public void setOutTransId(String outTransId) {
        this.outTransId = outTransId;
    }

    public String getAcctStat() {
        return acctStat;
    }

    public void setAcctStat(String acctStat) {
        this.acctStat = acctStat;
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

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId;
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

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    public String getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(String paymentFee) {
        this.paymentFee = paymentFee;
    }

    public String getCombinedpayData() {
        return combinedpayData;
    }

    public void setCombinedpayData(String combinedpayData) {
        this.combinedpayData = combinedpayData;
    }

    public String getCombinedpayDataFeeInfo() {
        return combinedpayDataFeeInfo;
    }

    public void setCombinedpayDataFeeInfo(String combinedpayDataFeeInfo) {
        this.combinedpayDataFeeInfo = combinedpayDataFeeInfo;
    }

    public String getTransFeeAllowanceInfo() {
        return transFeeAllowanceInfo;
    }

    public void setTransFeeAllowanceInfo(String transFeeAllowanceInfo) {
        this.transFeeAllowanceInfo = transFeeAllowanceInfo;
    }
}
