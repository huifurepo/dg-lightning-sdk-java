package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 微信正扫参数
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class WxData implements Serializable {
    /**
     * 扫码设备读出的条形码或者二维码信息
     */
    @JSONField(name = "auth_code")
    private String authCode;
    /**
     * 子商户应用ID
     */
    @JSONField(name = "sub_appid")
    private String subAppid;
    /**
     * 子商户用户标识
     */
    @JSONField(name = "sub_openid")
    private String subOpenid;
    /**
     * 附加数据
     */
    @JSONField(name = "attach")
    private String attach;
    /**
     * 商品描述
     */
    @JSONField(name = "body")
    private String body;
    /**
     * 商品详情
     */
    @JSONField(name = "detail")
    private Detail detail;
    /**
     * 场景信息
     */
    @JSONField(name = "scene_info")
    private SceneInfo sceneInfo;
    /**
     * 终端ip
     */
    @JSONField(name = "spbill_create_ip")
    private String spbillCreateIp;
    /**
     * 开发票入口开放标识
     */
    @JSONField(name = "receipt")
    private String receipt;
    /**
     * 设备信息
     */
    @JSONField(name = "device_info")
    private String deviceInfo;
    /**
     * 单品优惠标识
     */
    @JSONField(name = "promotion_flag")
    private String promotionFlag;
    /**
     * 订单优惠标记
     */
    @JSONField(name = "goods_tag")
    private String goodsTag;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

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

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
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

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getPromotionFlag() {
        return promotionFlag;
    }

    public void setPromotionFlag(String promotionFlag) {
        this.promotionFlag = promotionFlag;
    }
}
