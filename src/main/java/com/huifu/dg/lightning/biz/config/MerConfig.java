/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.dg.lightning.biz.config;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 商户配置
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class MerConfig {
    /**
     * 商户私钥，用于商户给交易信息签名
     */
    @JsonProperty("rsa_private_key")
    private String rsaPrivateKey;
    /**
     * 公钥，商户用公钥对汇付返回的信息进行验签
     */
    @JsonProperty("rsa_public_key")
    private String rsaPublicKey;
    /**
     * 产品号，由汇付分配
     */
    @JsonProperty( "product_id")
    private String procutId;
    /**
     * 系统号，由汇付分配
     */
    @JsonProperty("sys_id")
    private String sysId;

    /**
     * 自定义连接超时时间(ms)
     */
    @JsonProperty("custom_connect_timeout")
    private int customConnectTimeout;
    /**
     * 自定义读取超时时间(ms)
     */
    @JsonProperty( "custom_read_timeout")
    private int customReadtTimeout;

    /**
     * 自定义写入超时时间(ms)
     */
    @JsonProperty("custom_write_timeout")
    private int customWriteTimeout;

    public int getCustomConnectTimeout() {
        return customConnectTimeout;
    }

    public void setCustomConnectTimeout(int customConnectTimeout) {
        this.customConnectTimeout = customConnectTimeout;
    }

    public int getCustomReadtTimeout() {
        return customReadtTimeout;
    }

    public void setCustomReadtTimeout(int customReadtTimeout) {
        this.customReadtTimeout = customReadtTimeout;
    }

    public int getCustomWriteTimeout() {
        return customWriteTimeout;
    }

    public void setCustomWriteTimeout(int customWriteTimeout) {
        this.customWriteTimeout = customWriteTimeout;
    }

    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
    }

    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    public String getProcutId() {
        return procutId;
    }

    public void setProcutId(String procutId) {
        this.procutId = procutId;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

}
