/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.dg.lightning.biz.net;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class BaseRequest {
    @JsonProperty("data")
    private String data;
    @JsonProperty("sign")
    private String sign;
    @JsonProperty("sys_id")
    private String sysId;
    @JsonProperty("sign_type")
    private String signType;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
