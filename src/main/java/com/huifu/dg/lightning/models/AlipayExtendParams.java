package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 支付宝业务扩展参数
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class AlipayExtendParams implements Serializable {
    /**
     * 花呗分期数
     */
    @JsonProperty("hb_fq_num")
    private String hbFqNum;
    /**
     * 花呗卖家手续费百分比
     */
    @JsonProperty("hb_fq_seller_percent")
    private String hbFqSellerPercent;
    /**
     * 信用卡分期资产方式
     */
    @JsonProperty("fq_channels")
    private String fqChannels;

    public String getHbFqNum() {
        return hbFqNum;
    }

    public void setHbFqNum(String hbFqNum) {
        this.hbFqNum = hbFqNum;
    }

    public String getHbFqSellerPercent() {
        return hbFqSellerPercent;
    }

    public void setHbFqSellerPercent(String hbFqSellerPercent) {
        this.hbFqSellerPercent = hbFqSellerPercent;
    }

    public String getFqChannels() {
        return fqChannels;
    }

    public void setFqChannels(String fqChannels) {
        this.fqChannels = fqChannels;
    }
}
