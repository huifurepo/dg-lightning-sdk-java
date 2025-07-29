package com.huifu.dg.lightning.models;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

import java.util.Map;

public class PaymentRequest extends BaseRequest {


    /**
     * 请求日期
     */
    @JsonProperty(  "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JsonProperty(  "req_seq_id")
    private String reqSeqId;
    /**
     * 商户号
     */
    @JsonProperty(  "huifu_id")
    private String huifuId;
    /**
     * 商品描述
     */
    @JsonProperty(  "goods_desc")
    private String goodsDesc;
    /**
     * 交易类型
     */
    @JsonProperty(  "trade_type")
    private String tradeType;
    /**
     * 交易金额
     */
    @JsonProperty(  "trans_amt")
    private String transAmt;

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

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_JSPAY;
    }
}
