package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/***
 * @Description: 分账明细
 * @author: wang.hu_c
 * @date:2025年8月20日下午5:38:04
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AcctInfo implements Serializable {
    /**
     * 分账金额 (单位元，需保留小数点后两位，例如：1.00,最低传入0.01)
     */
    @JSONField(name = "div_amt")
    protected String divAmt;
    /**
     * 客户号
     */
    @JSONField(name = "huifu_id")
    protected String huifuId;
    /**
     * 账户号
     */
    @JSONField(name = "acct_id")
    protected String acctId;
    /**
     * 分账百分比%
     */
    @JSONField(name = "percentage_div")
    protected String percentageDiv;
    /**
     * 账务日期
     */
    @JSONField(name = "acct_date")
    protected String acctDate;

	public String getDivAmt() {
		return divAmt;
	}

	public void setDivAmt(String divAmt) {
		this.divAmt = divAmt;
	}

	public String getHuifuId() {
		return huifuId;
	}

	public void setHuifuId(String huifuId) {
		this.huifuId = huifuId;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getPercentageDiv() {
		return percentageDiv;
	}

	public void setPercentageDiv(String percentageDiv) {
		this.percentageDiv = percentageDiv;
	}

	public String getAcctDate() {
		return acctDate;
	}

	public void setAcctDate(String acctDate) {
		this.acctDate = acctDate;
	}
}
