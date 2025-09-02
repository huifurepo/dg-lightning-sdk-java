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
     * 订单优惠标记
     */
    @JsonProperty("goods_tag")
    private String goodsTag;

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
}
