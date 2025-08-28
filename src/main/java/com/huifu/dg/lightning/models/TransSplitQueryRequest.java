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
     * 汇付分配的商户号
     */
    @JsonProperty("huifu_id")
    private String huifuId;

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

    /**
     * 交易起始时间
     */
    @JsonProperty("begin_date")
    private String beginDate;

    /**
     * 交易结束时间
     */
    @JsonProperty("end_date")
    private String endDate;
    /**
     * 页码
     */
    @JsonProperty("page_no")
    private String pageNo;
    /**
     * 页大小
     */
    @JsonProperty("page_size")
    private String pageSize;

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

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_TRANS_SPLIT_QUERY;
    }



}
