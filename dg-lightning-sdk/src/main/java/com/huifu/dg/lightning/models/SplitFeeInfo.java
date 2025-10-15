package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 * @description: 分账手续费相关信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class SplitFeeInfo implements Serializable {

    @JsonProperty("total_split_fee_amt")
    private String totalSplitFeeAmt;

    /**
     * 分账手续费扣款标志
     */
    @JsonProperty("split_fee_flag")
    private Integer splitFeeFlag;

    /**
     * 分账手续费明细
     */
    @JsonProperty("split_fee_details")
    private List<SplitFeeDetail> splitFeeDetails;

    public String getTotalSplitFeeAmt() {
        return totalSplitFeeAmt;
    }

    public void setTotalSplitFeeAmt(String totalSplitFeeAmt) {
        this.totalSplitFeeAmt = totalSplitFeeAmt;
    }

    public Integer getSplitFeeFlag() {
        return splitFeeFlag;
    }

    public void setSplitFeeFlag(Integer splitFeeFlag) {
        this.splitFeeFlag = splitFeeFlag;
    }

    public List<SplitFeeDetail> getSplitFeeDetails() {
        return splitFeeDetails;
    }

    public void setSplitFeeDetails(List<SplitFeeDetail> splitFeeDetails) {
        this.splitFeeDetails = splitFeeDetails;
    }
}
