package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 收款方信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class PayeeInfo implements Serializable {
    /**
     * 商户类别
     */
    @JSONField(name = "mer_cat_code")
    private String merCatCode;
    /**
     * 二级商户代码
     */
    @JSONField(name = "sub_id")
    private String subId;
    /**
     * 二级商户名称
     */
    @JSONField(name = "sub_name")
    private String subName;
    /**
     * 终端号
     */
    @JSONField(name = "term_id")
    private String termId;

    public String getMerCatCode() {
        return merCatCode;
    }

    public void setMerCatCode(String merCatCode) {
        this.merCatCode = merCatCode;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }
}
