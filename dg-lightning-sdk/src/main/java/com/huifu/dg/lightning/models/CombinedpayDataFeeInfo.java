package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 补贴支付手续费承担方信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class CombinedpayDataFeeInfo implements Serializable {
    /**
     * 手续费承担方汇付号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 手续费承担方账户号
     */
    @JsonProperty("acct_id")
    private String acctId;
    /**
     * 手续费金额
     */
    @JsonProperty("combinedpay_fee_amt")
    private String combinedpayFeeAmt;

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

    public String getCombinedpayFeeAmt() {
        return combinedpayFeeAmt;
    }

    public void setCombinedpayFeeAmt(String combinedpayFeeAmt) {
        this.combinedpayFeeAmt = combinedpayFeeAmt;
    }
}
