package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 支付宝商品信息
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class AliGoodsDetail implements Serializable {
    /**
     * 商品编码
     */
    @JsonProperty("goods_id")
    private String goodsId;
    /**
     * 商品名称
     */
    @JsonProperty("goods_name")
    private String goodsName;
    /**
     * 商品单价(元)
     */
    @JsonProperty("price")
    private String price;
    /**
     * 商品数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 商品描述信息
     */
    @JsonProperty("body")
    private String body;
    /**
     * 商品类目树
     */
    @JsonProperty("categories_tree")
    private String categoriesTree;
    /**
     * 商品的展示地址
     */
    @JsonProperty("show_url")
    private String showUrl;
    /**
     * 商品类目
     */
    @JsonProperty("goods_category")
    private String goodsCategory;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategoriesTree() {
        return categoriesTree;
    }

    public void setCategoriesTree(String categoriesTree) {
        this.categoriesTree = categoriesTree;
    }

    public String getShowUrl() {
        return showUrl;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }
}
