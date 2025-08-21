package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 微信返回的响应报文
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class WxResponse implements Serializable {
    /**
     * 子商户公众账号ID
     */
    @JsonProperty("sub_appid")
    private String subAppid;
    /**
     * 用户标识
     */
    @JsonProperty("openid")
    private String openid;
    /**
     * 子商户用户标识
     */
    @JsonProperty("sub_openid")
    private String subOpenid;
    /**
     * 付款银行
     */
    @JsonProperty("bank_type")
    private String bankType;
    /**
     * 代金券金额
     */
    @JsonProperty("coupon_fee")
    private String couponFee;
    /**
     * 商家数据包
     */
    @JsonProperty("attach")
    private String attach;
    /**
     * 营销详情列表
     */
    @JsonProperty("promotion_detail")
    private List<PromotionDetail> promotionDetails;

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSubOpenid() {
        return subOpenid;
    }

    public void setSubOpenid(String subOpenid) {
        this.subOpenid = subOpenid;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(String couponFee) {
        this.couponFee = couponFee;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public List<PromotionDetail> getPromotionDetails() {
        return promotionDetails;
    }

    public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
        this.promotionDetails = promotionDetails;
    }
}
