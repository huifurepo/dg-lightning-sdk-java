package com.huifu.dg.lightning.biz.mer;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBasicdataEntRequest;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.dg.lightning.biz.mer.config.BaseCommonDemo;
import com.huifu.dg.lightning.biz.mer.config.OppsMerchantConfigDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/21 17:35
 * @description  企业商户进件-示例
 */
public class V2MerchantBasicdataEntRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBasicdataEntRequest request = new V2MerchantBasicdataEntRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商号
        request.setUpperHuifuId("6666000003080000");
        // 商户名称
        request.setRegName("集成企业商户8664");
        // 商户简称
        request.setShortName("企业商户3471");
        // 小票名称
        request.setReceiptName("盈盈超市");
        // 公司类型
        request.setEntType("1");
        // 所属行业参考[汇付MCC编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_hfmccbm) ；当use_head_info_flag&#x3D;Y时不填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5311&lt;/font&gt;
        request.setMcc("5411");
        // 经营类型1：实体，2：虚拟 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt; ；当use_head_info_flag&#x3D;Y时不填
        request.setBusiType("1");
        // 场景类型
        // request.setSceneType("test");
        // 证照图片
        // request.setLicensePic("test");
        // 证照编号
        request.setLicenseCode("20220422267883697");
        // 证照有效期类型
        request.setLicenseValidityType("1");
        // 证照有效期开始日期
        request.setLicenseBeginDate("20200401");
        // 证照有效期截止日期格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填；当license_validity_type&#x3D;1时为空；当use_head_info_flag&#x3D;Y时不填
        request.setLicenseEndDate("");
        // 成立时间
        // request.setFoundDate("test");
        // 注册资本保留两位小数；条件选填，国营企业、私营企业、外资企业、事业单位、其他、集体经济必填，政府机构、个体工商户可为空；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：100.00&lt;/font&gt;
        // request.setRegCapital("test");
        // 注册区
        request.setRegDistrictId("350203");
        // 注册详细地址
        request.setRegDetail("吉林省长春市思明区解放2路59096852");
        // 经营区
        request.setDistrictId("310104");
        // 经营详细地址scene_type&#x3D;OFFLINE/ALL时必填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：上海市徐汇区XX路XX号&lt;/font&gt;
        request.setDetailAddr("吉林省长春市思明区解放1路49227677");
        // 法人姓名
        request.setLegalName("陈立一");
        // 法人证件类型
        request.setLegalCertType("00");
        // 法人证件号码
        request.setLegalCertNo("321084198912060000");
        // 法人证件有效期类型
        request.setLegalCertValidityType("1");
        // 法人证件有效期开始日期
        request.setLegalCertBeginDate("20121201");
        // 法人证件有效期截止日期日期格式：yyyyMMdd， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填；&lt;br/&gt;当legal_cert_validity_type&#x3D;1时为空；&lt;br/&gt;当use_head_info_flag&#x3D;Y时不填
        request.setLegalCertEndDate("20301201");
        // 法人证件地址
        // request.setLegalAddr("test");
        // 法人身份证国徽面
        // request.setLegalCertBackPic("test");
        // 法人身份证人像面
        // request.setLegalCertFrontPic("test");
        // 联系人手机号
        request.setContactMobileNo("13111112222");
        // 联系人电子邮箱
        request.setContactEmail("jeff.peng@huifu.com");
        // 管理员账号
        request.setLoginName("LG20220422267883697");
        // 开户许可证企业商户需要，结算账号为对公账户必填；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F08；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setRegAcctPic("test");
        // 基本存款账户编号或核准号条件选填；当use_head_info_flag&#x3D;Y时不填 ；&lt;br/&gt;基本存款账户信息请填写基本存款账户编号；开户许可证请填写核准号。&lt;br/&gt;当注册地址或经营地址为如下地区时必填：江苏省、浙江省、湖南省、湖北省、云南省、贵州省、陕西省、河南省、吉林省、黑龙江省、福建省、海南省、重庆市、青海省、宁夏回族自治区；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：J2900123456789&lt;/font&gt;
        request.setOpenLicenceNo("");
        // 银行卡信息配置
        request.setCardInfo("{\"branch_code\":\"305290002096\",\"card_no\":\"698043508\",\"card_name\":\"上海以道数据服务中心\",\"card_type\":\"0\"}");
        // 卡正面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F13；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSettleCardFrontPic("test");
        // 持卡人身份证国徽面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F56；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSettleCertBackPic("test");
        // 持卡人身份证人像面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F55；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSettleCertFrontPic("test");
        // 授权委托书**对私非法人、对公非同名结算必填**；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F15；开通银行电子账户（中信E管家）需提供F520；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setAuthEntrustPic("test");
        // 上级汇付Id如果head_office_flag&#x3D;0，则字段必填，如果head_office_flag&#x3D;1，上级汇付Id不可传&lt;br/&gt;如果headOfficeFlag&#x3D;0，useHeadInfoFlag&#x3D;Y,且head_huifu_id不为空则基本信息部分复用上级的基本信息。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        // request.setHeadHuifuId("test");
        // 商户ICP备案编号商户ICP备案编号或网站许可证号；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：沪ICP备06046402号-28 &lt;/font&gt;&lt;br/&gt;类型为PC网站时，且为企业商户，且开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填
        request.setMerIcp("");
        // 店铺门头照
        // request.setStoreHeaderPic("test");
        // 店铺内景/工作区域照
        // request.setStoreIndoorPic("test");
        // 店铺收银台/公司前台照
        // request.setStoreCashierDeskPic("test");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 商户英文名称
        extendInfoMap.put("mer_en_name", "");
        // 证照类型
        extendInfoMap.put("license_type", "");
        // 经营范围
        // extendInfoMap.put("business_scope", "");
        // 注册省
        extendInfoMap.put("reg_prov_id", "350000");
        // 注册市
        extendInfoMap.put("reg_area_id", "350200");
        // 经营省
        extendInfoMap.put("prov_id", "310000");
        // 经营市
        extendInfoMap.put("area_id", "310100");
        // 法人手机号
        // extendInfoMap.put("legal_mobile_no", "");
        // 受益人列表
        // extendInfoMap.put("beneficiary_info", get685bb3e09f6d41358fff789b2321b8f5());
        // 联系人姓名
        extendInfoMap.put("contact_name", "联系人");
        // 商户通知标识
        extendInfoMap.put("sms_send_flag", "Y");
        // 客服电话
        extendInfoMap.put("service_phone", "021-121111221");
        // 结算业务配置
        extendInfoMap.put("settle_config", "{\"settle_pattern\":\"\",\"is_priority_receipt\":\"\",\"settle_time\":\"\",\"settle_cycle\":\"D1\",\"min_amt\":\"1.00\",\"remained_amt\":\"2.00\",\"settle_abstract\":\"abstract\",\"out_settle_flag\":\"2\",\"out_settle_huifuid\":\"\",  \"out_settle_acct_type\":\"\",\"fixed_ratio\":\"5.00\",\"settle_batch_no\":\"\"}");
        // 取现业务配置
        extendInfoMap.put("cash_config", "[{\"cash_type\":\"D0\",\"fix_amt\":\"1.00\",\"fee_rate\":\"\"},{\"cash_type\":\"D1\",\"fix_amt\":\"\",\"fee_rate\":\"10.00\"}]");
        // 商户身份
        // extendInfoMap.put("head_office_flag", "");
        // 使用上级资料信息
        // extendInfoMap.put("use_head_info_flag", "");
        // 商户主页URL
        extendInfoMap.put("mer_url", "");
        // 外部商户号
        // extendInfoMap.put("ext_mer_id", "");
        // 备注
        // extendInfoMap.put("remarks", "");
        // 异步请求地址
        extendInfoMap.put("async_return_url", "virgo://http://192.168.85.157:30031/sspm/testVirgo");
        // 斗拱e账户功能配置
        // extendInfoMap.put("elec_acct_config", get36f9286b687f4deb8237521f1b1691e2());
        // 股东信息
        // extendInfoMap.put("share_holder_info_list", get76c642a762224b489959Cf5921d41a22());
        // 扩展资料包
        // extendInfoMap.put("extended_material_list", get3457f985E17b41caBfd4Bb22603e2193());
        return extendInfoMap;
    }
}


