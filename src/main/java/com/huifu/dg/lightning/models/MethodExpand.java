package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 交易类型扩展参数
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class MethodExpand implements Serializable {
    /**
     * 微信公众号支付参数
     */
    @JsonProperty("T_JSAPI")
    private WxData tJsapi;
    /**
     * 微信小程序支付参数
     */
    @JsonProperty("T_MINIAPP")
    private WxData tMiniapp;
    /**
     * 微信APP支付参数
     */
    @JsonProperty("T_APP")
    private WxData tApp;
    /**
     * 微信反扫支付参数
     */
    @JsonProperty("T_MICROPAY")
    private WxData tMicropay;
    /**
     * 支付宝JS支付参数
     */
    @JsonProperty("A_JSAPI")
    private AlipayData aJsapi;
    /**
     * 支付宝正扫支付参数
     */
    @JsonProperty("A_NATIVE")
    private AlipayData aNative;
    /**
     * 支付宝反扫参数
     */
    @JsonProperty("A_MICROPAY")
    private AlipayData aMicropay;
    /**
     * 银联JS支付参数
     */
    @JsonProperty("U_JSAPI")
    private UnionpayData uJsapi;
    /**
     * 银联正扫支付参数
     */
    @JsonProperty("U_NATIVE")
    private UnionpayData uNative;
    /**
     * 银联反扫支付参数
     */
    @JsonProperty("U_MICROPAY")
    private UnionpayData uMicropay;

    public WxData gettJsapi() {
        return tJsapi;
    }

    public void settJsapi(WxData tJsapi) {
        this.tJsapi = tJsapi;
    }

    public WxData gettMiniapp() {
        return tMiniapp;
    }

    public void settMiniapp(WxData tMiniapp) {
        this.tMiniapp = tMiniapp;
    }

    public WxData gettApp() {
        return tApp;
    }

    public void settApp(WxData tApp) {
        this.tApp = tApp;
    }

    public WxData gettMicropay() {
        return tMicropay;
    }

    public void settMicropay(WxData tMicropay) {
        this.tMicropay = tMicropay;
    }

    public AlipayData getaJsapi() {
        return aJsapi;
    }

    public void setaJsapi(AlipayData aJsapi) {
        this.aJsapi = aJsapi;
    }

    public AlipayData getaNative() {
        return aNative;
    }

    public void setaNative(AlipayData aNative) {
        this.aNative = aNative;
    }

    public AlipayData getaMicropay() {
        return aMicropay;
    }

    public void setaMicropay(AlipayData aMicropay) {
        this.aMicropay = aMicropay;
    }

    public UnionpayData getuJsapi() {
        return uJsapi;
    }

    public void setuJsapi(UnionpayData uJsapi) {
        this.uJsapi = uJsapi;
    }

    public UnionpayData getuNative() {
        return uNative;
    }

    public void setuNative(UnionpayData uNative) {
        this.uNative = uNative;
    }

    public UnionpayData getuMicropay() {
        return uMicropay;
    }

    public void setuMicropay(UnionpayData uMicropay) {
        this.uMicropay = uMicropay;
    }
}
