package com.huifu.dg.lightning.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.models.BaseRequest;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 扫码交易查询
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class TradePaymentScanpayQueryRequest extends BaseRequest {
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
     * 全局流水号
     */
    @JsonProperty("hf_seq_id")
    private String hfSeqId;
    /**
     * 原请求流水号
     */
    @JsonProperty("orig_req_seq_id")
    private String origReqSeqId;

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

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public String getOrigReqSeqId() {
        return origReqSeqId;
    }

    public void setOrigReqSeqId(String origReqSeqId) {
        this.origReqSeqId = origReqSeqId;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.LIGHTNING_TRADE_PAYMENT_SCANPAY_QUERY;
    }
}
