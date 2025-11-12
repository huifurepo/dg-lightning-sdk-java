package com.huifu.dg.lightning.utils.enums;

/**
 * @Description: 函数代码枚举
 * @Author: sdk-generator
 */
public enum FunctionCodeEnum {

    /**
     * lightning聚合支付
     */
    LIGHTNING_TRADE_PAYMENT_CREATE("v4.trade.payment.create", "聚合支付"),

    /**
     * lightning扫码交易退款
     */
    LIGHTNING_TRADE_PAYMENT_SCANPAY_REFUND("v4.trade.payment.scanpay.refund", "扫码交易退款"),

    /**
     * lightning扫码交易退款查询
     */
    LIGHTNING_TRADE_PAYMENT_SCANPAY_REFUNDQUERY("v4.trade.payment.scanpay.refundquery", "扫码交易退款查询"),

    /**
     * 扫码交易查询
     */
    LIGHTNING_TRADE_PAYMENT_SCANPAY_QUERY("v4.trade.payment.scanpay.query", "扫码交易查询"),
    /**
     * 交易确认查询
     */
    V3_TRADE_PAYMENT_DELAYTRANS_CONFIRMQUERY("v3.trade.payment.delaytrans.confirmquery", "交易确认查询"),

    /**
     * 交易确认退款查询
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMREFUNDQUERY("v2.trade.payment.delaytrans.confirmrefundquery", "交易确认退款查询"),


    /**
     * 扫码交易关单
     */
    V2_TRADE_PAYMENT_SCANPAY_CLOSE("v2.trade.payment.scanpay.close", "扫码交易关单"),


    /**
     * 交易确认退款
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMREFUND("v2.trade.payment.delaytrans.confirmrefund", "交易确认退款"),

    /**
     * 交易确认
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRM("v2.trade.payment.delaytrans.confirm", "交易确认"),
    /**
     * 扫码交易关单查询
     */
    V2_TRADE_PAYMENT_SCANPAY_CLOSEQUERY("v2.trade.payment.scanpay.closequery", "扫码交易关单查询"),


    /**
     * 交易分账明细查询
     */
    V2_TRADE_TRANS_SPLIT_QUERY("v2.trade.trans.split.query", "交易分账明细查询"),

    ;

    private final String code;

    private final String name;

    FunctionCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
