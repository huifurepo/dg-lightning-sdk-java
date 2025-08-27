package com.huifu.dg.lightning.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/***
 * @Description: 聚合下单
 * @author: wang.hu_c
 * @date:2025年8月20日下午5:41:09
 * @version V1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PaymentRequest extends BaseRequest {
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
     * 账户号
     */
    @JsonProperty("acct_id")
    private String acctId;
    /**
     * 商品描述
     */
    @JsonProperty("goods_desc")
    private String goodsDesc;
    /**
     * 交易类型
     */
    @JsonProperty("trade_type")
    private String tradeType;
    /**
     * 交易类型扩展参数
     */
    @JsonProperty("method_expand")
    private MethodExpand methodExpand;
    /**
     * 交易金额
     */
    @JsonProperty("trans_amt")
    private String transAmt;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 交易有效期
     */
    @JsonProperty("time_expire")
    private String timeExpire;
    /**
     * 延迟标识
     */
    @JsonProperty("delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 手续费扣款标识
     */
    @JsonProperty("fee_flag")
    private String feeFlag;
    /**
     * 分账对象
     */
    @JsonProperty("acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;
    /**
     * 禁用信用卡标记
     */
    @JsonProperty("limit_pay_type")
    private String limitPayType;
    /**
     * 渠道号
     */
    @JsonProperty("channel_no")
    private String channelNo;
    /**
     * 场景类型
     */
    @JsonProperty("pay_scene")
    private String payScene;
    /**
     * 安全信息
     */
    @JsonProperty("risk_check_data")
    private RiskCheckData riskCheckData;
    /**
     * 设备信息
     */
    @JsonProperty("terminal_device_data")
    private TerminalDeviceData terminalDeviceData;
    /**
     * 异步通知地址
     */
    @JsonProperty("notify_url")
    private String notifyUrl;
    /**
     * 扩展参数集合
     */
    @JsonProperty("tx_metadata")
    private TxMetadata txMetadata;
    /**
     * 传入分账遇到优惠的处理规则
     */
    @JsonProperty("term_div_coupon_type")
    private Integer termDivCouponType;
    /**
     * 商户贴息标记
     */
    @JsonProperty("fq_mer_discount_flag")
    private String fqMerDiscountFlag;
    /**
     * 手续费补贴信息
     */
    @JsonProperty("trans_fee_allowance_info")
    private TransFeeAllowanceInfo transFeeAllowanceInfo;
    /**
     * 补贴支付手续费承担方信息
     */
    @JsonProperty("combinedpay_data_fee_info")
    private CombinedpayDataFeeInfo combinedpayDataFeeInfo;
    /**
     * 补贴支付信息
     */
    @JsonProperty("combinedpay_data")
    private CombinedpayData combinedpayData;



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

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getDelayAcctFlag() {
        return delayAcctFlag;
    }

    public void setDelayAcctFlag(String delayAcctFlag) {
        this.delayAcctFlag = delayAcctFlag;
    }

    public String getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(String feeFlag) {
        this.feeFlag = feeFlag;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public AcctSplitBunch getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(AcctSplitBunch acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public TransFeeAllowanceInfo getTransFeeAllowanceInfo() {
        return transFeeAllowanceInfo;
    }

    public void setTransFeeAllowanceInfo(TransFeeAllowanceInfo transFeeAllowanceInfo) {
        this.transFeeAllowanceInfo = transFeeAllowanceInfo;
    }

    public CombinedpayDataFeeInfo getCombinedpayDataFeeInfo() {
        return combinedpayDataFeeInfo;
    }

    public void setCombinedpayDataFeeInfo(CombinedpayDataFeeInfo combinedpayDataFeeInfo) {
        this.combinedpayDataFeeInfo = combinedpayDataFeeInfo;
    }

    public CombinedpayData getCombinedpayData() {
        return combinedpayData;
    }

    public void setCombinedpayData(CombinedpayData combinedpayData) {
        this.combinedpayData = combinedpayData;
    }

    public String getLimitPayType() {
        return limitPayType;
    }

    public void setLimitPayType(String limitPayType) {
        this.limitPayType = limitPayType;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getPayScene() {
        return payScene;
    }

    public void setPayScene(String payScene) {
        this.payScene = payScene;
    }

    public TerminalDeviceData getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(TerminalDeviceData terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getTermDivCouponType() {
        return termDivCouponType;
    }

    public void setTermDivCouponType(Integer termDivCouponType) {
        this.termDivCouponType = termDivCouponType;
    }

    public String getFqMerDiscountFlag() {
        return fqMerDiscountFlag;
    }

    public void setFqMerDiscountFlag(String fqMerDiscountFlag) {
        this.fqMerDiscountFlag = fqMerDiscountFlag;
    }

    public MethodExpand getMethodExpand() {
        return methodExpand;
    }

    public void setMethodExpand(MethodExpand methodExpand) {
        this.methodExpand = methodExpand;
    }

    public RiskCheckData getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(RiskCheckData riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public TxMetadata getTxMetadata() {
        return txMetadata;
    }

    public void setTxMetadata(TxMetadata txMetadata) {
        this.txMetadata = txMetadata;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.LIGHTNING_TRADE_PAYMENT_PAY;
    }
}
