package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 外部指定买家
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class ExtUserInfo implements Serializable {
    /**
     * 姓名
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 手机号
     */
    @JSONField(name = "mobile")
    private String mobile;
    /**
     * 证件类型
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 证件号
     */
    @JSONField(name = "cert_no")
    private String certNo;
    /**
     * 允许的最小买家年龄
     */
    @JSONField(name = "min_age")
    private String minAge;
    /**
     * 是否强制校验付款人身份信息
     */
    @JSONField(name = "fix_buyer")
    private String fixBuyer;
    /**
     * 是否强制校验身份信息
     */
    @JSONField(name = "need_check_info")
    private String needCheckInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getFixBuyer() {
        return fixBuyer;
    }

    public void setFixBuyer(String fixBuyer) {
        this.fixBuyer = fixBuyer;
    }

    public String getNeedCheckInfo() {
        return needCheckInfo;
    }

    public void setNeedCheckInfo(String needCheckInfo) {
        this.needCheckInfo = needCheckInfo;
    }
}
