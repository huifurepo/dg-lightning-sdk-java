package com.huifu.dg.lightning.utils.enums;

public enum PaymentTypeEnum {
    // 微信支付类型
    T_JSAPI("T_JSAPI", "微信公众号支付"),
    T_MINIAPP("T_MINIAPP", "微信小程序支付"),
    T_APP("T_APP", "微信APP支付"),
    T_MICROPAY("T_MICROPAY", "微信反扫支付"),

    // 支付宝支付类型
    A_JSAPI("A_JSAPI", "支付宝JS支付"),
    A_NATIVE("A_NATIVE", "支付宝正扫支付"),
    A_MICROPAY("A_MICROPAY", "支付宝反扫"),

    // 银联支付类型
    U_JSAPI("U_JSAPI", "银联JS支付"),
    U_NATIVE("U_NATIVE", "银联正扫支付"),
    U_MICROPAY("U_MICROPAY", "银联反扫支付");

    private final String typeCode;
    private final String desc;

    public String getTypeCode() {
        return typeCode;
    }

    public String getDesc() {
        return desc;
    }

    PaymentTypeEnum(String typeCode, String desc) {
        this.typeCode = typeCode;
        this.desc = desc;
    }
}
