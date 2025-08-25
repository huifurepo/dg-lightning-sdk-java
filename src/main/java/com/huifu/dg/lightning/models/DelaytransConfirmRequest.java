package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 延时交易确认
 * @author: wang.hu_c
 * @date: 2025年08月22日
 */
public class DelaytransConfirmRequest extends BaseRequest{
    /**
     * 请求日期
     */
    @JsonProperty("req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JsonProperty("req_seq_id")
    private String reqSeqId;
    /**
     * 商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 原交易请求日期
     */
    @JsonProperty("org_req_date")
    private String orgReqDate;
    /**
     * 原交易请求流水号
     */
    @JsonProperty("org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原交易商户订单号
     */
    @JsonProperty("org_mer_ord_id")
    private String orgMerOrdId;
    /**
     * 原交易全局流水号
     */
    @JsonProperty("org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 分账对象
     */
    @JsonProperty("acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;
    /**
     * 分账对象
     */
    @JsonProperty("risk_check_data")
    private RiskCheckData riskCheckData;
    /**
     * 交易类型
     */
    @JsonProperty("pay_type")
    private String payType;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 灵活用工标志
     */
    @JsonProperty("hyc_flag")
    private String hycFlag;
    /**
     * 灵活用工平台
     */
    @JsonProperty("lg_platform_type")
    private String lgPlatformType;
    /**
     * 代发模式
     */
    @JsonProperty("salary_modle_type")
    private String salaryModleType;
    /**
     * 落地公司商户号
     */
    @JsonProperty("bmember_id")
    private String bmemberId;
    /**
     * 乐接活请求参数集合
     */
    @JsonProperty("ljh_data")
    private LjhData ljhData;
    /**
     * 异步通知地址
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgMerOrdId() {
        return orgMerOrdId;
    }

    public void setOrgMerOrdId(String orgMerOrdId) {
        this.orgMerOrdId = orgMerOrdId;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public AcctSplitBunch getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(AcctSplitBunch acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public RiskCheckData getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(RiskCheckData riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHycFlag() {
        return hycFlag;
    }

    public void setHycFlag(String hycFlag) {
        this.hycFlag = hycFlag;
    }

    public String getLgPlatformType() {
        return lgPlatformType;
    }

    public void setLgPlatformType(String lgPlatformType) {
        this.lgPlatformType = lgPlatformType;
    }

    public String getSalaryModleType() {
        return salaryModleType;
    }

    public void setSalaryModleType(String salaryModleType) {
        this.salaryModleType = salaryModleType;
    }

    public String getBmemberId() {
        return bmemberId;
    }

    public void setBmemberId(String bmemberId) {
        this.bmemberId = bmemberId;
    }

    public LjhData getLjhData() {
        return ljhData;
    }

    public void setLjhData(LjhData ljhData) {
        this.ljhData = ljhData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_DELAYTRANS_CONFIRM;
    }
}
