package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 微信商品信息
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class WxGoodsDetail implements Serializable {
    /**
     * 商品编码
     */
    @JSONField(name = "goods_id")
    private String goodsId;
    /**
     * 商品名称
     */
    @JSONField(name = "goods_name")
    private String goodsName;
    /**
     * 商品单价(元)
     */
    @JSONField(name = "price")
    private String price;
    /**
     * 商品优惠金额
     */
    @JSONField(name = "discount_amount")
    private String discountAmount;
    /**
     * 商品数量
     */
    @JSONField(name = "quantity")
    private Integer quantity;
    /**
     * 微信侧商品编码
     */
    @JSONField(name = "wxpay_goods_id")
    private String wxpayGoodsId;
    /**
     * 商品备注
     */
    @JSONField(name = "goods_remark")
    private String goodsRemark;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getWxpayGoodsId() {
        return wxpayGoodsId;
    }

    public void setWxpayGoodsId(String wxpayGoodsId) {
        this.wxpayGoodsId = wxpayGoodsId;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark;
    }
}
