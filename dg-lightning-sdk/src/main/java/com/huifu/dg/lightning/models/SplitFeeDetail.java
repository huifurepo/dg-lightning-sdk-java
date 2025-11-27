package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 分账手续费明细
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class SplitFeeDetail implements Serializable {

    /**
     * 分账手续费金额
     */
    @JSONField(name = "split_fee_amt")
    private String splitFeeAmt;

    /**
     * 分账手续费扣款标志
     */
    @JSONField(name = "split_fee_flag")
    private Integer splitFeeFlag;

    /**
     * 分账手续费扣款状态
     */
    @JSONField(name = "split_fee_stat")
    private String splitFeeStat;

    /**
     * 分账手续费承担方商户号
     */
    @JSONField(name = "split_fee_huifu_id")
    private String splitFeeHuifuId;

    /**
     * 分账手续费承担方账号
     */
    @JSONField(name = "split_fee_acct_id")
    private String splitFeeAcctId;

    public String getSplitFeeAmt() {
        return splitFeeAmt;
    }

    public void setSplitFeeAmt(String splitFeeAmt) {
        this.splitFeeAmt = splitFeeAmt;
    }

    public Integer getSplitFeeFlag() {
        return splitFeeFlag;
    }

    public void setSplitFeeFlag(Integer splitFeeFlag) {
        this.splitFeeFlag = splitFeeFlag;
    }

    public String getSplitFeeStat() {
        return splitFeeStat;
    }

    public void setSplitFeeStat(String splitFeeStat) {
        this.splitFeeStat = splitFeeStat;
    }

    public String getSplitFeeHuifuId() {
        return splitFeeHuifuId;
    }

    public void setSplitFeeHuifuId(String splitFeeHuifuId) {
        this.splitFeeHuifuId = splitFeeHuifuId;
    }

    public String getSplitFeeAcctId() {
        return splitFeeAcctId;
    }

    public void setSplitFeeAcctId(String splitFeeAcctId) {
        this.splitFeeAcctId = splitFeeAcctId;
    }
}
