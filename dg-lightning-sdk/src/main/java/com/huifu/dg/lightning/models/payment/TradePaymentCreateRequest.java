package com.huifu.dg.lightning.models.payment;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.models.BaseRequest;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/***
 * @Description: 聚合下单
 * @author: wang.hu_c
 * @date:2025年8月20日下午5:41:09
 * @version V1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class TradePaymentCreateRequest extends BaseRequest {
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
    private String methodExpand;
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
    private String acctSplitBunch;
    /**
     * 设备信息
     */
    @JsonProperty("terminal_device_data")
    private String terminalDeviceData;
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

    public String getMethodExpand() {
        return methodExpand;
    }

    public void setMethodExpand(String methodExpand) {
        this.methodExpand = methodExpand;
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

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(String terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.LIGHTNING_TRADE_PAYMENT_CREATE;
    }
}
