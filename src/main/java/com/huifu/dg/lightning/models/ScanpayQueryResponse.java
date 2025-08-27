package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description:
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class ScanpayQueryResponse implements Serializable {
    /**
     * /**
     * 结算金额
     */
    @JsonProperty("settlement_amt")
    String settlementAmt;

    /**
     * 业务响应码
     */
    @JsonProperty("resp_code")
    private String respCode;
    /**
     * 业务响应信息
     */

    @JsonProperty("resp_desc")
    private String respDesc;
    /**
     * 商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;
    /**
     * 商户号
     */
    @JsonProperty("acct_id")
    private String acctId;
    /**
     * 机构请求流水号
     */
    @JsonProperty("req_date")
    private String reqDate;
    /**
     *原机构请求流水号
     */
    @JsonProperty("req_seq_id")
    private String reqSeqId;
    /**
     *交易返回的全局流水号
     */
    @JsonProperty("hf_seq_id")
    private String hfSeqId;
    /**
     * 交易类型
     */
    @JsonProperty("trade_type")
    private String tradeType;
    /**
     * 交易金额
     */
    @JsonProperty("trans_amt")
    private String transAmt;
    /**
     * 分账对象
     */
    @JsonProperty("acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;
    /**
     * 延时标记
     */
    @JsonProperty("delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 备注/商户私有域
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 外部通道返回码
     */
    @JsonProperty("bank_code")
    private String bankCode;
    /**
     * 外部通道返回描述
     */
    @JsonProperty("bank_message")
    private String bankMessage;

    /**
     * 交易状态
     */
    @JsonProperty("trans_stat")
    private String transStat;
    /**
     * 账务状态 I：初始、P：处理中、S：成功、F：失败
     */
    @JsonProperty("acct_stat")
    private String acctStat;
    /**
     * 微信支付宝订单号
     */
    @JsonProperty("out_trans_id")
    private String outTransId;
    /**
     * 支付凭证号
     */
    @JsonProperty("party_order_id")
    private String partyOrderId;
    /**
     * 支付完成实际
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * 借贷记标识 D-借记卡，C-信用卡,Z-借贷合一卡
     */
    @JsonProperty("debit_type")
    private String debitType;
    /**
     * 是否分账交易
     */
    @JsonProperty("div_flag")
    private String divFlag;
    /**
     * 账务日期
     */
    @JsonProperty("acct_date")
    private String acctDate;
    /**
     * 微信用户唯一标识码
     */
    @JsonProperty("wx_user_id")
    private String wxUserId;
    /**
     * 待确认金额
     */
    @JsonProperty("unconfirm_amt")
    private String unconfirmAmt;
    /**
     * 终端类型
     */
    @JsonProperty("device_type")
    private String deviceType;
    /**
     * 手续费商户号
     */
    @JsonProperty("atu_sub_mer_id")
    private String atuSubMerId;
    /**
     * 交易扩展参数
     */
    @JsonProperty("method_expand")
    private MethodExpand methodExpand;
    /**
     * 手续费对象
     */
    @JsonProperty("payment_fee")
    private PaymentFee paymentFee;
    /**
     * 资金冻结状态
     */
    @JsonProperty("fund_freeze_stat")
    private String fundFreezeStat;
    /**
     * 冻结金额
     */
    @JsonProperty("unfreeze_amt")
    String unfreezeAmt;
    /**
     * 冻结时间
     */
    @JsonProperty("freeze_time")
    String freezeTime;
    /**
     * 解冻时间
     */
    @JsonProperty("unfreeze_time")
    String unfreezeTime;
}
