package com.huifu.dg.lightning.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 交易分账明细查询
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class TransSplitQueryRequest extends BaseRequest {

    /**
     * 请求系统号
     */
    @JsonProperty("sys_id" )
    private String sysId;

    /**
     * 汇付分配的商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;

    /**
     * 产品号
     */
    @JsonProperty("product_id")
    private String productId;

    /**
     * 分账交易汇付全局流水号
     */
    @JsonProperty("hf_seq_id")
    private String hfSeqId;

    /**
     * 交易类型
     */
    @JsonProperty("ord_type")
    private String ordType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_TRANS_SPLIT_QUERY;
    }


    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }
}
