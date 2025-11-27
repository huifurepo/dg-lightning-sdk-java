package com.huifu.dg.lightning.models.solution.delayTrans;


import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.BaseRequest;
import com.huifu.dg.lightning.utils.enums.FunctionCodeEnum;

/**
 * @description: 交易分账明细查询
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class TradeTransSplitQueryRequest extends BaseRequest {

    /**
     * 汇付分配的商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    /**
     * 分账交易汇付全局流水号
     */
    @JSONField(name = "hf_seq_id")
    private String hfSeqId;

    /**
     * 交易类型
     */
    @JSONField(name = "ord_type")
    private String ordType;

    /**
     * 交易起始时间
     */
    @JSONField(name = "begin_date")
    private String beginDate;

    /**
     * 交易结束时间
     */
    @JSONField(name = "end_date")
    private String endDate;
    /**
     * 页码
     */
    @JSONField(name = "page_no")
    private String pageNo;
    /**
     * 页大小
     */
    @JSONField(name = "page_size")
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
