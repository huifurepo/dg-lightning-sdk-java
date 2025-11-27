package com.huifu.dg.lightning.models.payment;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.BaseRequest;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 扫码交易查询
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class TradePaymentScanpayQueryRequest extends BaseRequest {
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 全局流水号
     */
    @JSONField(name = "hf_seq_id")
    private String hfSeqId;
    /**
     * 原请求流水号
     */
    @JSONField(name = "out_ord_id")
    private String outOrdId;

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

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public String getOutOrdId() {
        return outOrdId;
    }

    public void setOutOrdId(String outOrdId) {
        this.outOrdId = outOrdId;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.LIGHTNING_TRADE_PAYMENT_SCANPAY_QUERY;
    }
}
