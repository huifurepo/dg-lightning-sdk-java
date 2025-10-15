package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 门店信息
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class StoreInfo implements Serializable {
    /**
     * 门店id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 门店名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 门店行政区划码
     */
    @JsonProperty("area_code")
    private String areaCode;
    /**
     * 门店详细地址
     */
    @JsonProperty("address")
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
