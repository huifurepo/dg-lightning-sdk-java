package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 微信反扫
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class WxScanData implements Serializable {
    /**
     * 子商户公众账号id
     */
    @JsonProperty("sub_appid")
    private String subAppid;
    /**
     * 设备号
     */
    @JsonProperty("device_info")
    private String deviceInfo;
    /**
     * 订单优惠标记
     */
    @JsonProperty("goods_tag")
    private String goodsTag;
    /**
     * 附加数据
     */
    @JsonProperty("attach")
    private String attach;
    /**
     * 商品详情
     */
    @JsonProperty("detail")
    private Detail detail;
    /**
     * 场景信息
     */
    @JsonProperty("scene_info")
    private SceneInfo sceneInfo;
    /**
     * 单品优惠标识
     */
    @JsonProperty("promotion_flag")
    private String promotionFlag;
    /**
     * 收款设备IP
     */
    @JsonProperty("spbill_create_ip")
    private String spbillCreateIp;
    /**
     * 电子发票入口开放标识
     */
    @JsonProperty("receipt")
    private String receipt;

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public SceneInfo getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(SceneInfo sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    public String getPromotionFlag() {
        return promotionFlag;
    }

    public void setPromotionFlag(String promotionFlag) {
        this.promotionFlag = promotionFlag;
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
}
