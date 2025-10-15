package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 补贴支付信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class CombinedpayData implements Serializable {
    /**
     * 补贴方汇付商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 补贴方类型
     */
    @JsonProperty("user_type")
    private String userType;
    /**
     * 补贴方账户号
     */
    @JsonProperty("acct_id")
    private String acctId;
    /**
     * 补贴金额
     */
    @JsonProperty("amount")
    private String amount;

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
