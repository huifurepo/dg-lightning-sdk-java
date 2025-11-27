package com.huifu.dg.lightning.models.solution.delayTrans;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.dg.lightning.models.AcctSplitBunch;

import java.io.Serializable;

/**
 * @description: 延时交易确认查询返回参数
 * @author: wang.hu_c
 * @date: 2025年08月25日
 */
public class TradePaymentDelayTransConfirmQueryResponse implements Serializable {
    /**
     * 业务响应码
     */
    @JSONField(name = "resp_code")
    private String respCode;
    /**
     * 业务响应信息
     */
    @JSONField(name = "resp_desc")
    private String respDesc;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 交易状态
     */
    @JSONField(name = "trans_stat")
    private String transStat;
    /**
     * 待确认总金额
     */
    @JSONField(name = "unconfirm_amt")
    private String unconfirmAmt;
    /**
     * 待确认总金额
     */
    @JSONField(name = "confirmed_amt")
    private String confirmedAmt;
    /**
     * 汇付全局流水号
     */
    @JSONField(name = "hf_seq_id")
    private String hfSeqId;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private AcctSplitBunch acctSplitBunch;
    /**
     * 备注
     */
    @JSONField(name = "remark")
    private String remark;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat;
    }

    public String getUnconfirmAmt() {
        return unconfirmAmt;
    }

    public void setUnconfirmAmt(String unconfirmAmt) {
        this.unconfirmAmt = unconfirmAmt;
    }

    public String getConfirmedAmt() {
        return confirmedAmt;
    }

    public void setConfirmedAmt(String confirmedAmt) {
        this.confirmedAmt = confirmedAmt;
    }

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public AcctSplitBunch getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(AcctSplitBunch acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
