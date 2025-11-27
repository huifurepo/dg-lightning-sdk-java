package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 优惠券信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class VoucherDetail implements Serializable {
    /**
     * 券id
     */
    @JSONField(name = "id")
    private String id;
    /**
     * 券名称
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 券类型
     */
    @JSONField(name = "type")
    private String type;
    /**
     * 优惠券面额
     */
    @JSONField(name = "amount")
    private String amount;
    /**
     * 商家出资
     */
    @JSONField(name = "merchant_contribute")
    private String merchantContribute;
    /**
     * 其他出资方出资金额
     */
    @JSONField(name = "other_contribute")
    private String otherContribute;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMerchantContribute() {
        return merchantContribute;
    }

    public void setMerchantContribute(String merchantContribute) {
        this.merchantContribute = merchantContribute;
    }

    public String getOtherContribute() {
        return otherContribute;
    }

    public void setOtherContribute(String otherContribute) {
        this.otherContribute = otherContribute;
    }
}
