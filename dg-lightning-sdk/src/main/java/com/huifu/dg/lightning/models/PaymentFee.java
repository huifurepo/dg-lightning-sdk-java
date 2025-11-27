package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 手续费对象
 * @author: wang.hu_c
 * @date: 2025年08月27日
 */
public class PaymentFee implements Serializable {
    /**
     * 手续费商户号
     */
    @JSONField(name = "fee_hui_id")
    private String feeHuiId;
    /**
     * 手续费扣款标志
     */
    @JSONField(name = "fee_flag")
    private String feeFlag;
    /**
     * 手续费费率信息
     */
    @JSONField(name = "fee_formula_infos")
    private List<FeeFormulaInfo> feeFormulaInfos;
    /**
     * 手续费金额
     */
    @JSONField(name = "fee_amount")
    private String feeAmount;

    public String getFeeHuiId() {
        return feeHuiId;
    }

    public void setFeeHuiId(String feeHuiId) {
        this.feeHuiId = feeHuiId;
    }

    public String getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(String feeFlag) {
        this.feeFlag = feeFlag;
    }

    public List<FeeFormulaInfo> getFeeFormulaInfos() {
        return feeFormulaInfos;
    }

    public void setFeeFormulaInfos(List<FeeFormulaInfo> feeFormulaInfos) {
        this.feeFormulaInfos = feeFormulaInfos;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }
}
