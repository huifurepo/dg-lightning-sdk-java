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
     * 请求流水号
     */
    @JsonProperty("req_seq_id")
    private String reqSeqId;
    /**
     * 商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 交易类型
     */
    @JsonProperty("trade_type")
    private String tradeType;
    /**
     * 交易类型扩展参数
     */
    @JsonProperty("method_expand")
    private String methodExpand;
    /**
     * 交易金额
     */
    @JsonProperty("trans_amt")
    private String transAmt;
    /**
     * 商品描述
     */
    @JsonProperty("goods_desc")
    private String goodsDesc;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 交易有效期
     */
    @JsonProperty("time_expire")
    private String timeExpire;
    /**
     * 延迟标识
     */
    @JsonProperty("delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 分账对象
     */
    @JsonProperty("acct_split_bunch")
    private String acctSplitBunch;
    /**
     * 禁用信用卡标记
     */
    @JsonProperty("limit_pay_type")
    private String limitPayType;
    /**
     * 渠道号
     */
    @JsonProperty("channel_no")
    private String channelNo;
    /**
     * 场景类型
     */
    @JsonProperty("pay_scene")
    private String payScene;
    /**
     * 设备信息
     */
    @JsonProperty("terminal_device_data")
    private String terminalDeviceData;
    /**
     * 异步通知地址
     */
    @JsonProperty("notify_url")
    private String notifyUrl;
    /**
     * 交易状态
     */
    @JsonProperty("trans_stat")
    private String transStat;
    /**
     * 扩展参数集合
     */
    @JsonProperty("tx_metadata")
    private String txMetadata;

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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getMethodExpand() {
        return methodExpand;
    }

    public void setMethodExpand(String methodExpand) {
        this.methodExpand = methodExpand;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getDelayAcctFlag() {
        return delayAcctFlag;
    }

    public void setDelayAcctFlag(String delayAcctFlag) {
        this.delayAcctFlag = delayAcctFlag;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getLimitPayType() {
        return limitPayType;
    }

    public void setLimitPayType(String limitPayType) {
        this.limitPayType = limitPayType;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getPayScene() {
        return payScene;
    }

    public void setPayScene(String payScene) {
        this.payScene = payScene;
    }

    public String getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(String terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }

    public String getTxMetadata() {
        return txMetadata;
    }

    public void setTxMetadata(String txMetadata) {
        this.txMetadata = txMetadata;
    }
}
