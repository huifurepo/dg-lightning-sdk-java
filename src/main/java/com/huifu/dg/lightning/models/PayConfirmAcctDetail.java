package com.huifu.dg.lightning.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 交易确认帐务明细
 * @author: wang.hu_c
 * @date: 2025年08月22日
 */
public class PayConfirmAcctDetail implements Serializable {

    /**
     * 商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;

    /**
     * 账户号
     */
    @JsonProperty("acct_id")
    private String acctId;

    /**
     * 分账金额
     */
    @JsonProperty("div_amt")
    private String divAmt;

    /**
     * 手续费扣款标志 1:外扣 2:内扣
     */
    @JsonProperty("fee_flag")
    private String feeFlag;

    /**
     * 手续费商户号
     */
    @JsonProperty("fee_huifu_id")
    private String feeHuifuId;

    /**
     * 手续费账户号
     */
    @JsonProperty("fee_acct_id")
    private String feeAcctId;

    /**
     * 交易确认明细状态
     */
    @JsonProperty("trans_stat")
    private String transStat;

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

    public String getDivAmt() {
        return divAmt;
    }

    public void setDivAmt(String divAmt) {
        this.divAmt = divAmt;
    }

    public String getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(String feeFlag) {
        this.feeFlag = feeFlag;
    }

    public String getFeeHuifuId() {
        return feeHuifuId;
    }

    public void setFeeHuifuId(String feeHuifuId) {
        this.feeHuifuId = feeHuifuId;
    }

    public String getFeeAcctId() {
        return feeAcctId;
    }

    public void setFeeAcctId(String feeAcctId) {
        this.feeAcctId = feeAcctId;
    }

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }
}
