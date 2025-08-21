package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 商品详情
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class Detail implements Serializable {
    /**
     * 订单原价(元)
     */
    @JsonProperty("cost_price")
    private String costPrice;
    /**
     * 商品小票ID
     */
    @JsonProperty("receipt_id")
    private String receiptId;
    /**
     * 单品列表
     */
    @JsonProperty("goods_detail")
    private List<WxGoodsDetail> wxGoodsDetail;

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public List<WxGoodsDetail> getGoodsDetail() {
        return wxGoodsDetail;
    }

    public void setGoodsDetail(List<WxGoodsDetail> wxGoodsDetail) {
        this.wxGoodsDetail = wxGoodsDetail;
    }
}
