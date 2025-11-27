package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 活动详情
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class CurAllowanceConfigInfo implements Serializable {
    /**
     * 门店
     */
    @JSONField(name = "acct_id")
    private String acctId;
    /**
     * 商户号
     */
    @JSONField(name = "merchant_group")
    private String merchantGroup;
    /**
     * 补贴方
     */
    @JSONField(name = "allowance_sys")
    private String allowanceSys;
    /**
     * 补贴方ID
     */
    @JSONField(name = "allowance_sys_id")
    private String allowanceSysId;
    /**
     * 补贴类型
     */
    @JSONField(name = "is_delay_allowance")
    private String isDelayAllowance;
    /**
     * 活动编号
     */
    @JSONField(name = "market_id")
    private String marketId;
    /**
     * 活动名称
     */
    @JSONField(name = "market_name")
    private String marketName;
    /**
     * 活动描述
     */
    @JSONField(name = "market_desc")
    private String marketDesc;
    /**
     * 开始日期
     */
    @JSONField(name = "start_time")
    private String startTime;
    /**
     * 结束日期
     */
    @JSONField(name = "end_time")
    private String endTime;
    /**
     * POS借记卡额度
     */
    @JSONField(name = "pos_debit_limit_amt")
    private String posDebitLimitAmt;
    /**
     * POS贷记卡额度
     */
    @JSONField(name = "pos_credit_limit_amt")
    private String posCreditLimitAmt;
    /**
     * POS补贴额度
     */
    @JSONField(name = "pos_limit_amt")
    private String posLimitAmt;
    /**
     * 扫码补贴额度
     */
    @JSONField(name = "qr_limit_amt")
    private String qrLimitAmt;
    /**
     * 总补贴额度
     */
    @JSONField(name = "total_limit_amt")
    private String totalLimitAmt;
    /**
     * 活动是否有效
     */
    @JSONField(name = "status")
    private String status;
    /**
     * 是否人工操作
     */
    @JSONField(name = "human_flag")
    private String humanFlag;
    /**
     * 活动号
     */
    @JSONField(name = "activity_id")
    private String activityId;
    /**
     * 活动名称
     */
    @JSONField(name = "activity_name")
    private String activityName;
    /**
     * 创建人
     */
    @JSONField(name = "create_by")
    private String createBy;
    /**
     * 创建时间
     */
    @JSONField(name = "create_time")
    private String createTime;
    /**
     * 更新时间
     */
    @JSONField(name = "update_time")
    private String updateTime;

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getMerchantGroup() {
        return merchantGroup;
    }

    public void setMerchantGroup(String merchantGroup) {
        this.merchantGroup = merchantGroup;
    }

    public String getAllowanceSys() {
        return allowanceSys;
    }

    public void setAllowanceSys(String allowanceSys) {
        this.allowanceSys = allowanceSys;
    }

    public String getAllowanceSysId() {
        return allowanceSysId;
    }

    public void setAllowanceSysId(String allowanceSysId) {
        this.allowanceSysId = allowanceSysId;
    }

    public String getIsDelayAllowance() {
        return isDelayAllowance;
    }

    public void setIsDelayAllowance(String isDelayAllowance) {
        this.isDelayAllowance = isDelayAllowance;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketDesc() {
        return marketDesc;
    }

    public void setMarketDesc(String marketDesc) {
        this.marketDesc = marketDesc;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPosDebitLimitAmt() {
        return posDebitLimitAmt;
    }

    public void setPosDebitLimitAmt(String posDebitLimitAmt) {
        this.posDebitLimitAmt = posDebitLimitAmt;
    }

    public String getPosCreditLimitAmt() {
        return posCreditLimitAmt;
    }

    public void setPosCreditLimitAmt(String posCreditLimitAmt) {
        this.posCreditLimitAmt = posCreditLimitAmt;
    }

    public String getPosLimitAmt() {
        return posLimitAmt;
    }

    public void setPosLimitAmt(String posLimitAmt) {
        this.posLimitAmt = posLimitAmt;
    }

    public String getQrLimitAmt() {
        return qrLimitAmt;
    }

    public void setQrLimitAmt(String qrLimitAmt) {
        this.qrLimitAmt = qrLimitAmt;
    }

    public String getTotalLimitAmt() {
        return totalLimitAmt;
    }

    public void setTotalLimitAmt(String totalLimitAmt) {
        this.totalLimitAmt = totalLimitAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHumanFlag() {
        return humanFlag;
    }

    public void setHumanFlag(String humanFlag) {
        this.humanFlag = humanFlag;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
