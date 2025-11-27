package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 支付宝返回的响应报文
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class AlipayResponse implements Serializable {
    /**
     * 优惠券信息
     */
    @JSONField(name = "voucher_detail_list")
    private List<VoucherDetail> voucherDetailList;
    /**
     * 资金渠道
     */
    @JSONField(name = "fund_bill_list")
    private List<FundBill> fundBillList;
    /**
     * 买家的支付宝唯一用户号
     */
    @JSONField(name = "buyer_id")
    private String buyerId;
    /**
     * 买家支付宝账号
     */
    @JSONField(name = "buyer_logon_id")
    private String buyerLogonId;
    /**
     * 花呗分期数
     */
    @JSONField(name = "hb_fq_num")
    private String hbFqNum;
    /**
     * 卖家承担的手续费百分比
     */
    @JSONField(name = "hb_fq_seller_percent")
    private String hbFqSellerPercent;

    public List<VoucherDetail> getVoucherDetailList() {
        return voucherDetailList;
    }

    public void setVoucherDetailList(List<VoucherDetail> voucherDetailList) {
        this.voucherDetailList = voucherDetailList;
    }

    public List<FundBill> getFundBillList() {
        return fundBillList;
    }

    public void setFundBillList(List<FundBill> fundBillList) {
        this.fundBillList = fundBillList;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getHbFqNum() {
        return hbFqNum;
    }

    public void setHbFqNum(String hbFqNum) {
        this.hbFqNum = hbFqNum;
    }

    public String getHbFqSellerPercent() {
        return hbFqSellerPercent;
    }

    public void setHbFqSellerPercent(String hbFqSellerPercent) {
        this.hbFqSellerPercent = hbFqSellerPercent;
    }
}
