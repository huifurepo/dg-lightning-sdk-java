package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 银联返回的响应报文
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class UnionpayResponse implements Serializable {
    /**
     * 二维码有效时间
     */
    @JsonProperty("qr_valid_time")
    private String qrValidTime;

    public String getQrValidTime() {
        return qrValidTime;
    }

    public void setQrValidTime(String qrValidTime) {
        this.qrValidTime = qrValidTime;
    }
}
