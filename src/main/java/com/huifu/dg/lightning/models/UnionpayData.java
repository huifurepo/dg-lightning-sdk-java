package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 银联参数集合
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class UnionpayData implements Serializable {
    /**
     * 二维码
     */
    @JsonProperty("qr_code")
    private String qrCode;
    /**
     * 收款方附加数据
     */
    @JsonProperty("addn_data")
    private String addnData;
    /**
     * 地区信息
     */
    @JsonProperty("area_info")
    private String areaInfo;
    /**
     * 持卡人ip
     */
    @JsonProperty("customer_ip")
    private String customerIp;
    /**
     * 前台通知地址
     */
    @JsonProperty("front_url")
    private String frontUrl;
    /**
     * 订单描述
     */
    @JsonProperty("order_desc")
    private String orderDesc;
    /**
     * 收款方附言
     */
    @JsonProperty("payee_comments")
    private String payeeComments;
    /**
     * 收款方信息
     */
    @JsonProperty("payee_info")
    private PayeeInfo payeeInfo;
    /**
     * 银联分配的服务商机构标识码
     */
    @JsonProperty("pnr_ins_id_cd")
    private String pnrInsIdCd;
    /**
     * 请求方自定义域
     */
    @JsonProperty("req_reserved")
    private String reqReserved;
    /**
     * 终端信息
     */
    @JsonProperty("term_info")
    private String termInfo;
    /**
     * 银联用户标识
     */
    @JsonProperty("user_id")
    private String userId;
    /**
     * 服务商信息
     */
    @JsonProperty("pid_info")
    private PidInfo pidInfo;

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getAddnData() {
        return addnData;
    }

    public void setAddnData(String addnData) {
        this.addnData = addnData;
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getPayeeComments() {
        return payeeComments;
    }

    public void setPayeeComments(String payeeComments) {
        this.payeeComments = payeeComments;
    }

    public PayeeInfo getPayeeInfo() {
        return payeeInfo;
    }

    public void setPayeeInfo(PayeeInfo payeeInfo) {
        this.payeeInfo = payeeInfo;
    }

    public String getPnrInsIdCd() {
        return pnrInsIdCd;
    }

    public void setPnrInsIdCd(String pnrInsIdCd) {
        this.pnrInsIdCd = pnrInsIdCd;
    }

    public String getReqReserved() {
        return reqReserved;
    }

    public void setReqReserved(String reqReserved) {
        this.reqReserved = reqReserved;
    }

    public String getTermInfo() {
        return termInfo;
    }

    public void setTermInfo(String termInfo) {
        this.termInfo = termInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PidInfo getPidInfo() {
        return pidInfo;
    }

    public void setPidInfo(PidInfo pidInfo) {
        this.pidInfo = pidInfo;
    }
}
