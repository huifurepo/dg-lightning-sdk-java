package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 营销详情
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class PromotionDetail implements Serializable {
    /**
     * 券id
     */
    @JsonProperty("promotion_id")
    private String promotionId;
    /**
     * 优惠名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 优惠范围
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * 优惠类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 优惠券面额
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 活动ID
     */
    @JsonProperty("activity_id")
    private String activity_id;
    /**
     * 商户出资
     */
    @JsonProperty("merchant_contribute")
    private String merchantContribute;
    /**
     * 其他出资
     */
    @JsonProperty("other_contribute")
    private String otherContribute;
    /**
     * 单品列表
     */
    @JsonProperty("goods_detail")
    private List<WxGoodsDetail> goodsDetails;

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
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

    public List<WxGoodsDetail> getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(List<WxGoodsDetail> goodsDetails) {
        this.goodsDetails = goodsDetails;
    }
}
