package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 聚合下单返回对象
 * @author: wang.hu_c
 * @date: 2025年08月27日
 */
public class AggregateTransResponse extends BaseResponse implements Serializable {
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
     * 交易状态
     */
    @JsonProperty("trans_stat")
    private String transStat;
    /**
     * 是否延迟入账
     */
    @JsonProperty("delay_acct_flag")
    private String delayAcctFlag;
    /**
     * 交易备注 商户私有域
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 设备类型。
     */
    @JsonProperty("device_type")
    private String deviceType;
    /**
     * 支付凭证号
     */
    @JsonProperty("party_order_id")
    private String partyOrderId;
    /**
     * 待确认金额
     */
    @JsonProperty("unconfirm_amt")
    private String unconfirmAmt;

    /**
     * 结算金额
     */
    @JsonProperty("settlement_amt")
    String settlementAmt;

    /**
     * 微信支付宝订单号
     */
    @JsonProperty("out_trans_id")
    private String outTransId;
    /**
     * 账务状态
     */
    @JsonProperty("acct_stat")
    private String acctStat;
    /**
     * 外部通道返回码
     */
    @JsonProperty("bank_code")
    private String bankCode;

    /**
     * 通道返回描述
     */
    @JsonProperty("bank_message")
    private String bankMessage;

    /**
     * 支付完成时间
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * 借贷标识
     */
    @JsonProperty("debit_type")
    private String debitType;

    /**
     * 微信用户唯一标识码
     */
    @JsonProperty("wx_user_id")
    private String wxUserId;

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
     * 二维码链接
     */
    @JsonProperty("qr_code")
    private String qrCode;
    /**
     * js支付信息
     */
    @JsonProperty("pay_info")
    private String payInfo;
    /**
     * 手续费对象
     */
    @JsonProperty("payment_fee")
    private PaymentFee paymentFee;
    /**
     * 补贴支付信息
     */
    @JsonProperty("combinedpay_data")
    private CombinedpayData combinedpayData;

    /**
     * 补贴支付手续费承担方信息
     */
    @JsonProperty("combinedpay_data_fee_info")
    private CombinedpayDataFeeInfo combinedpayDataFeeInfo;

    /**
     * 手续费补贴信息
     */
    @JsonProperty("trans_fee_allowance_info")
    private TransFeeAllowanceInfo transFeeAllowanceInfo;


}
