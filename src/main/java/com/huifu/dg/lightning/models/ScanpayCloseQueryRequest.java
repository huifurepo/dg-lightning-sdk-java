package com.huifu.dg.lightning.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 关单查询请求实体
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class ScanpayCloseQueryRequest extends BaseRequest {
    /**
     * 请求流水号
     */
    @JsonProperty("req_seq_id")
    private String reqSeqId;
    /**
     * 请求日期
     */
    @JsonProperty("req_date")
    private String reqDate;
    /**
     * 商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 原交易请求日期
     */
    @JsonProperty("org_req_date")
    private String orgReqDate;
    /**
     * 原交易返回的全局流水号
     */
    @JsonProperty("org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 原交易请求流水号
     */
    @JsonProperty("org_req_seq_id")
    private String orgReqSeqId;

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
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

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_SCANPAY_CLOSEQUERY;
    }
}
