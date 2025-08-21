package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 安全信息
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class RiskCheckData implements Serializable {
    /**
     * ip地址
     */
    @JsonProperty("ip_addr")
    private String ipAddr;
    /**
     * 基站地址
     */
    @JsonProperty("base_station")
    private String baseStation;
    /**
     * 纬度
     */
    @JsonProperty("latitude")
    private String latitude;
    /**
     * 经度
     */
    @JsonProperty("longitude")
    private String longitude;
}
