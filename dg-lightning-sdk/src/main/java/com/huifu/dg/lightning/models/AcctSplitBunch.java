package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/***
 * @Description: 分账串
 * @author: wang.hu_c
 * @date:2025年8月20日下午5:41:09
 * @version V1.0 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AcctSplitBunch implements Serializable {
	/***
	 * 百分比分账标志
	 */
    @JSONField(name = "percentage_flag")
	protected String percentageFlag;

	/***
	 * 是否净值分账
	 */
    @JSONField(name = "is_clean_split")
	protected String isCleanSplit;
	/***
	 * 分账明细
	 */
    @JSONField(name = "acct_infos")
	protected List<AcctInfo> acctInfos;


	public String getPercentageFlag() {
		return percentageFlag;
	}

	public void setPercentageFlag(String percentageFlag) {
		this.percentageFlag = percentageFlag;
	}

	public String getIsCleanSplit() {
		return isCleanSplit;
	}

	public void setIsCleanSplit(String isCleanSplit) {
		this.isCleanSplit = isCleanSplit;
	}

	public List<AcctInfo> getAcctInfos() {
		return acctInfos;
	}

	public void setAcctInfos(List<AcctInfo> acctInfos) {
		this.acctInfos = acctInfos;
	}

}
