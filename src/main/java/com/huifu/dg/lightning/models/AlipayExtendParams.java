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
     * 卡类型
     */
    @JsonProperty("card_type")
    private String cardType;
    /**
     * 支付宝点餐场景类型
     */
    @JsonProperty("food_order_type")
    private String foodOrderType;
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
     * 行业数据回流信息
     */
    @JsonProperty("industry_reflux_info")
    private String industryRefluxInfo;
    /**
     * 信用卡分期资产方式
     */
    @JsonProperty("fq_channels")
    private String fqChannels;
    /**
     * 停车场id
     */
    @JsonProperty("parking_id")
    private String parkingId;
    /**
     * 系统商编号
     */
    @JsonProperty("sys_service_provider_id")
    private String sysServiceProviderId;
}
