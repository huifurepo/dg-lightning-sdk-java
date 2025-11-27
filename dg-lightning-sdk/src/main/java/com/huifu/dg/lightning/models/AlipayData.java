package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 支付宝正扫参数
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class AlipayData implements Serializable {
    /**
     * 扫码设备读出的条形码或者二维码信息
     */
    @JSONField(name = "auth_code")
    private String authCode;
    /**
     * 买家的支付宝唯一用户号
     */
    @JSONField(name = "buyer_id")
    private String buyerId;
    /**
     * 买家支付宝账号
     */
    @JSONField(name = "buyer_logon_id")
    private String buyerLogonId;
    /**
     * 业务扩展参数
     */
    @JSONField(name = "extend_params")
    private AlipayExtendParams extendParams;
    /**
     * 订单包含的商品列表信息
     */
    @JSONField(name = "goods_detail")
    private List<AliGoodsDetail> goodsDetails;
    /**
     * 卖家支付宝用户号
     */
    @JSONField(name = "seller_id")
    private String sellerId;
    /**
     * 优惠明细参数
     */
    @JSONField(name = "ali_promo_params")
    private String aliPromoParams;

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public AlipayExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(AlipayExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    public List<AliGoodsDetail> getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(List<AliGoodsDetail> goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getAliPromoParams() {
        return aliPromoParams;
    }

    public void setAliPromoParams(String aliPromoParams) {
        this.aliPromoParams = aliPromoParams;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
