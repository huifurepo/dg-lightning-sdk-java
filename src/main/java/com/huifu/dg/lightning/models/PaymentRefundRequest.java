package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 交易退款
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class PaymentRefundRequest extends BaseRequest{
    /**
     * 请求日期
     */
    @JsonProperty("req_date")
    private String reqDate;
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
     * 申请退款金额
     */
    @JsonProperty("ord_amt")
    private String ordAmt;
    /**
     * 原交易请求日期
     */
    @JsonProperty("org_req_date")
    private String orgReqDate;
    /**
     * 原交易全局流水号
     */
    @JsonProperty("org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 原交易微信支付宝的商户单号
     */
    @JsonProperty("org_party_order_id")
    private String orgPartyOrderId;
    /**
     * 原交易请求流水号
     */
    @JsonProperty("org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 安全信息
     */
    @JsonProperty("risk_check_data")
    private RiskCheckData riskCheckData;
    /**
     * 设备信息
     */
    @JsonProperty("terminal_device_data")
    private TerminalDeviceData terminalDeviceData;
    /**
     * 异步通知地址
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 交易类型扩展参数
     */
    @JsonProperty("method_expand")
    private MethodExpand methodExpand;

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

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
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

    public String getOrgPartyOrderId() {
        return orgPartyOrderId;
    }

    public void setOrgPartyOrderId(String orgPartyOrderId) {
        this.orgPartyOrderId = orgPartyOrderId;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public RiskCheckData getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(RiskCheckData riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public TerminalDeviceData getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(TerminalDeviceData terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public MethodExpand getMethodExpand() {
        return methodExpand;
    }

    public void setMethodExpand(MethodExpand methodExpand) {
        this.methodExpand = methodExpand;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_TRADE_PAYMENT_SCANPAY_REFUND;
    }
}
