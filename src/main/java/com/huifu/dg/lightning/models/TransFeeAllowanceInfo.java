package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 手续费补贴信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class TransFeeAllowanceInfo implements Serializable {
    /**
     * 补贴手续费金额
     */
    @JsonProperty("allowance_fee_amt")
    private String allowanceFeeAmt;
    /**
     * 商户应收手续费
     */
    @JsonProperty("receivable_fee_amt")
    private String receivableFeeAmt;
    /**
     * 商户实收手续费
     */
    @JsonProperty("actual_fee_amt")
    private String actualFeeAmt;
    /**
     * 补贴类型
     */
    @JsonProperty("allowance_type")
    private String allowanceType;
    /**
     * 不补贴原因
     */
    @JsonProperty("no_allowance_desc")
    private String noAllowanceDesc;
    /**
     * 活动详情
     */
    @JsonProperty("cur_allowance_config_infos")
    private List<CurAllowanceConfigInfo> curAllowanceConfigInfos;

    public String getAllowanceFeeAmt() {
        return allowanceFeeAmt;
    }

    public void setAllowanceFeeAmt(String allowanceFeeAmt) {
        this.allowanceFeeAmt = allowanceFeeAmt;
    }

    public String getReceivableFeeAmt() {
        return receivableFeeAmt;
    }

    public void setReceivableFeeAmt(String receivableFeeAmt) {
        this.receivableFeeAmt = receivableFeeAmt;
    }

    public String getActualFeeAmt() {
        return actualFeeAmt;
    }

    public void setActualFeeAmt(String actualFeeAmt) {
        this.actualFeeAmt = actualFeeAmt;
    }

    public String getAllowanceType() {
        return allowanceType;
    }

    public void setAllowanceType(String allowanceType) {
        this.allowanceType = allowanceType;
    }

    public String getNoAllowanceDesc() {
        return noAllowanceDesc;
    }

    public void setNoAllowanceDesc(String noAllowanceDesc) {
        this.noAllowanceDesc = noAllowanceDesc;
    }

    public List<CurAllowanceConfigInfo> getCurAllowanceConfigInfos() {
        return curAllowanceConfigInfos;
    }

    public void setCurAllowanceConfigInfos(List<CurAllowanceConfigInfo> curAllowanceConfigInfos) {
        this.curAllowanceConfigInfos = curAllowanceConfigInfos;
    }
}
