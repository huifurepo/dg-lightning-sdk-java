package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 支付宝正扫参数
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class AlipayData implements Serializable {
    /**
     * 支付宝的店铺编号
     */
    @JsonProperty("alipay_store_id")
    private String alipayStoreId;
    /**
     * 买家的支付宝唯一用户号
     */
    @JsonProperty("buyer_id")
    private String buyerId;
    /**
     * 买家支付宝账号
     */
    @JsonProperty("buyer_logon_id")
    private String buyerLogonId;
    /**
     * 业务扩展参数
     */
    @JsonProperty("extend_params")
    private AlipayExtendParams extendParams;
    /**
     * 订单包含的商品列表信息
     */
    @JsonProperty("goods_detail")
    private List<AliGoodsDetail> goodsDetails;
    /**
     * 商户原始订单号
     */
    @JsonProperty("merchant_order_no")
    private String merchantOrderNo;
    /**
     * 商户操作员编号
     */
    @JsonProperty("operator_id")
    private String operatorId;
    /**
     * 销售产品码
     */
    @JsonProperty("product_code")
    private String productCode;
    /**
     * 卖家支付宝用户号
     */
    @JsonProperty("seller_id")
    private String sellerId;
    /**
     * 商户门店编号
     */
    @JsonProperty("store_id")
    private String storeId;
    /**
     * 外部指定买家
     */
    @JsonProperty("ext_user_info")
    private ExtUserInfo extUserInfo;
    /**
     * 订单标题
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * 商家门店名称
     */
    @JsonProperty("store_name")
    private String storeName;
    /**
     * 小程序应用的appid
     */
    @JsonProperty("op_app_id")
    private String opAppId;
    /**
     * 商户业务信息
     */
    @JsonProperty("ali_business_params")
    private String aliBusinessParams;
    /**
     * 订单描述
     */
    @JsonProperty("body")
    private String body;
    /**
     * 优惠明细参数
     */
    @JsonProperty("ali_promo_params")
    private String aliPromoParams;

    public String getAlipayStoreId() {
        return alipayStoreId;
    }

    public void setAlipayStoreId(String alipayStoreId) {
        this.alipayStoreId = alipayStoreId;
    }

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

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public ExtUserInfo getExtUserInfo() {
        return extUserInfo;
    }

    public void setExtUserInfo(ExtUserInfo extUserInfo) {
        this.extUserInfo = extUserInfo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getOpAppId() {
        return opAppId;
    }

    public void setOpAppId(String opAppId) {
        this.opAppId = opAppId;
    }

    public String getAliBusinessParams() {
        return aliBusinessParams;
    }

    public void setAliBusinessParams(String aliBusinessParams) {
        this.aliBusinessParams = aliBusinessParams;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAliPromoParams() {
        return aliPromoParams;
    }

    public void setAliPromoParams(String aliPromoParams) {
        this.aliPromoParams = aliPromoParams;
    }
}
