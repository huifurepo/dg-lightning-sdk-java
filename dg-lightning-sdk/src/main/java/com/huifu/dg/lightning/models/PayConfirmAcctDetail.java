package com.huifu.dg.lightning.models;


import com.alibaba.fastjson.annotation.JSONField;

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
    @JSONField(name = "huifu_id")
    private String huifuId;

    /**
     * 账户号
     */
    @JSONField(name = "acct_id")
    private String acctId;

    /**
     * 分账金额
     */
    @JSONField(name = "div_amt")
    private String divAmt;

    /**
     * 手续费扣款标志 1:外扣 2:内扣
     */
    @JSONField(name = "fee_flag")
    private String feeFlag;

    /**
     * 手续费商户号
     */
    @JSONField(name = "fee_huifu_id")
    private String feeHuifuId;

    /**
     * 手续费账户号
     */
    @JSONField(name = "fee_acct_id")
    private String feeAcctId;

    /**
     * 交易确认明细状态
     */
    @JSONField(name = "trans_stat")
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
