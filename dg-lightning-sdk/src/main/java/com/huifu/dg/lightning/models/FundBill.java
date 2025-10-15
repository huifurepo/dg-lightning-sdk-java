package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 资金渠道
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class FundBill implements Serializable {
    /**
     * 银行卡支付时的银行代码
     */
    @JsonProperty("bank_code")
    private String bankCode;
    /**
     * 该支付工具类型所使用的金额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 交易使用的资金渠道
     */
    @JsonProperty("fund_channel")
    private String fundChannel;
    /**
     * 渠道所使用的资金类型
     */
    @JsonProperty("fund_type")
    private String fundType;
    /**
     * 渠道实际付款金额
     */
    @JsonProperty("real_amount")
    private String realAmount;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFundChannel() {
        return fundChannel;
    }

    public void setFundChannel(String fundChannel) {
        this.fundChannel = fundChannel;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(String realAmount) {
        this.realAmount = realAmount;
    }
}
