package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 微信正扫参数
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class WxData implements Serializable {
    /**
     * 子商户应用ID
     */
    @JsonProperty("sub_appid")
    private String subAppid;
    /**
     * 子商户用户标识
     */
    @JsonProperty("sub_openid")
    private String subOpenid;
    /**
     * 附加数据
     */
    @JsonProperty("attach")
    private String attach;
    /**
     * 商品描述
     */
    @JsonProperty("body")
    private String body;
    /**
     * 商品详情
     */
    @JsonProperty("detail")
    private Detail detail;
    /**
     * 设备信息
     */
    @JsonProperty("device_info")
    private String deviceInfo;
    /**
     * 订单优惠标记
     */
    @JsonProperty("goods_tag")
    private String goodsTag;
    /**
     * 实名支付
     */
    @JsonProperty("identity")
    private String identity;
    /**
     * 开发票入口开放标识
     */
    @JsonProperty("receipt")
    private String receipt;
    /**
     * 场景信息
     */
    @JsonProperty("scene_info")
    private SceneInfo sceneInfo;
    /**
     * 终端ip
     */
    @JsonProperty("spbill_create_ip")
    private String spbillCreateIp;
    /**
     * 单品优惠标识
     */
    @JsonProperty("promotion_flag")
    private String promotionFlag;
    /**
     * 商品ID
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * 指定支付者
     */
    @JsonProperty("limit_payer")
    private String limitPayer;

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getSubOpenid() {
        return subOpenid;
    }

    public void setSubOpenid(String subOpenid) {
        this.subOpenid = subOpenid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public SceneInfo getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getPromotionFlag() {
        return promotionFlag;
    }

    public void setPromotionFlag(String promotionFlag) {
        this.promotionFlag = promotionFlag;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLimitPayer() {
        return limitPayer;
    }

    public void setLimitPayer(String limitPayer) {
        this.limitPayer = limitPayer;
    }
}
