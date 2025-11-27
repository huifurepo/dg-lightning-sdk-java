package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 手续费费率信息
 * @author: wang.hu_c
 * @date: 2025年08月27日
 */
public class FeeFormulaInfo implements Serializable {
    /**
     * 手续费计算公式
     */
    @JSONField(name = "fee_formula")
    private String feeFormula;
    /**
     * 手续费类型
     */
    @JSONField(name = "fee_type")
    private String feeType;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    public String getFeeFormula() {
        return feeFormula;
    }

    public void setFeeFormula(String feeFormula) {
        this.feeFormula = feeFormula;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }
}
