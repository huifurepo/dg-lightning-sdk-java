package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 乐接活请求参数
 * @author: wang.hu_c
 * @date: 2025年08月25日
 */
public class LjhData implements Serializable {
    /**
     * 税源地ID
     */
    @JSONField(name = "tax_area_id")
    private String taxAreaId;
    /**
     * 任务模板ID
     */
    @JSONField(name = "template_id")
    private String templateId;

    public String getTaxAreaId() {
        return taxAreaId;
    }

    public void setTaxAreaId(String taxAreaId) {
        this.taxAreaId = taxAreaId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
