package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

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
    @JSONField(name = "cost_price")
    private String costPrice;
    /**
     * 商品小票ID
     */
    @JSONField(name = "receipt_id")
    private String receiptId;
    /**
     * 单品列表
     */
    @JSONField(name = "goods_detail")
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
