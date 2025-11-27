package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

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
    @JSONField(name = "ip_addr")
    private String ipAddr;
    /**
     * 基站地址
     */
    @JSONField(name = "base_station")
    private String baseStation;
    /**
     * 纬度
     */
    @JSONField(name = "latitude")
    private String latitude;
    /**
     * 经度
     */
    @JSONField(name = "longitude")
    private String longitude;
}
