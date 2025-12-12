package com.huifu.dg.lightning.biz.mer;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBasicdataEntRequest;
import com.huifu.dg.lightning.biz.client.BasePayClient;
import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.biz.mer.config.BaseCommonDemo;
import com.huifu.dg.lightning.biz.mer.config.DemoTestConstants;
import com.huifu.dg.lightning.biz.mer.config.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.HashMap;
import java.util.Map;

/**
 * @author meisheng.han
 * @date 2025/11/25 17:35
 * @description  企业商户进件-示例
 */
public class MerchantBasicdataEntDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 启用调试日志，便于观察请求与响应
        BasePay.debug = true;
        // 设置为生产模式，保持与SupplementaryPictureUploadDemo一致
        BasePay.prodMode = BasePay.MODE_INNER_TEST;

        // 初始化商户配置（产品号、系统号、RSA密钥），保持与SupplementaryPictureUploadDemo一致
        MerConfig merConfig = new MerConfig();
        merConfig.setProductId("JCTEST");
        merConfig.setSysId("6666000108406684");
        merConfig.setRsaPrivateKey(DemoTestConstants.JCTEST_RSA_PRIVATE_KEY);
        merConfig.setRsaPublicKey(DemoTestConstants.JCTEST_RSA_PUBLIC_KEY);
        BasePay.initWithMerConfig(merConfig);

        // 组装业务参数data（按照接口必填字段）
        Map<String, Object> params = new HashMap<>();

        // 请求日期，格式yyyyMMdd
        params.put("req_date", DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号，当天唯一，自动生成32位随机值
        params.put("req_seq_id", SequenceTools.getReqSeqId32());
        // 渠道商号
        params.put("upper_huifu_id", "6666000108406684");
        // 商户名称
        params.put("reg_name", "上海非优先公司");
        // 商户简称
        params.put("short_name", "夏秀兰");
        // 小票名称
        params.put("receipt_name", "越示音定西选");
        // 公司类型
        params.put("ent_type", "3");
        // 所属行业参考[汇付MCC编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_hfmccbm) ；当use_head_info_flag&#x3D;Y时不填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5311&lt;/font&gt;
        params.put("mcc", "5411");
        // 经营类型1：实体，2：虚拟 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt; ；当use_head_info_flag&#x3D;Y时不填
        params.put("busi_type", "1");
        // 场景类型
        params.put("scene_type", "ALL");
        // 证照图片
        params.put("license_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 证照编号
        params.put("license_code", "91440101MA5CYF1910");
        // 证照有效期类型
        params.put("license_validity_type", "1");
        // 证照有效期开始日期
        params.put("license_begin_date", "20251124");
        // 证照有效期截止日期格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填；当license_validity_type&#x3D;1时为空；当use_head_info_flag&#x3D;Y时不填
        params.put("license_end_date", "");
        // 成立时间
        params.put("found_date", "20251124");
        // 注册资本保留两位小数；条件选填，国营企业、私营企业、外资企业、事业单位、其他、集体经济必填，政府机构、个体工商户可为空；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：100.00&lt;/font&gt;
        params.put("reg_capital", "1");
        // 注册区
        params.put("reg_district_id", "310104");
        // 注册详细地址
        params.put("reg_detail", "立者精要最者");
        // 经营区
        params.put("district_id", "310104");
        // 经营详细地址scene_type&#x3D;OFFLINE/ALL时必填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：上海市徐汇区XX路XX号&lt;/font&gt;
        params.put("detail_addr", "新疆维吾尔自治区新界源城区");
        // 法人姓名
        params.put("legal_name", "秦有");
        // 法人证件类型
        params.put("legal_cert_type", "00");
        // 法人证件号码
        params.put("legal_cert_no", "210102196803129997");
        // 法人证件有效期类型
        params.put("legal_cert_validity_type", "1");
        // 法人证件有效期开始日期
        params.put("legal_cert_begin_date", "20080722");
        // 法人证件有效期截止日期日期格式：yyyyMMdd， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填；&lt;br/&gt;当legal_cert_validity_type&#x3D;1时为空；&lt;br/&gt;当use_head_info_flag&#x3D;Y时不填
        params.put("legal_cert_end_date", "");
        // 法人证件地址
        params.put("legal_addr", "五商构性变见");
        // 法人身份证国徽面
        params.put("legal_cert_back_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 法人身份证人像面
        params.put("legal_cert_front_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 联系人手机号
        params.put("contact_mobile_no", "18153745560");
        // 联系人电子邮箱
        params.put("contact_email", "r.bpjtjtd@zyqrdcgkr.mh");
        // 管理员账号
        params.put("login_name", SequenceTools.getReqSeqId32());
        // 开户许可证企业商户需要，结算账号为对公账户必填；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F08；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        params.put("reg_acct_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 基本存款账户编号或核准号条件选填；当use_head_info_flag&#x3D;Y时不填 ；&lt;br/&gt;基本存款账户信息请填写基本存款账户编号；开户许可证请填写核准号。&lt;br/&gt;当注册地址或经营地址为如下地区时必填：江苏省、浙江省、湖南省、湖北省、云南省、贵州省、陕西省、河南省、吉林省、黑龙江省、福建省、海南省、重庆市、青海省、宁夏回族自治区；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：J2900123456789&lt;/font&gt;
        params.put("open_licence_no", "");
        // 银行卡信息配置
        params.put("card_info", "{\"card_type\":\"0\",\"card_name\":\"上海非优先公司\",\"card_no\":\"4340622119959288\",\"prov_id\":\"310000\",\"area_id\":\"310100\",\"bank_code\":\"01050000\",\"branch_code\":\"105290077021\",\"branch_name\":\"中国建设银行股份有限公司上海市中支行\",\"cert_type\":\"00\",\"cert_no\":\"110101199003072551\",\"cert_validity_type\":\"1\",\"cert_begin_date\":\"20251124\",\"cert_end_date\":\"\",\"mp\":\"19817763491\",\"is_settle_default\":\"Y\"}");
        // 卡正面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F13；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        params.put("settle_card_front_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 持卡人身份证国徽面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F56；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        params.put("settle_cert_back_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 持卡人身份证人像面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F55；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        params.put("settle_cert_front_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 上级汇付Id如果head_office_flag&#x3D;0，则字段必填，如果head_office_flag&#x3D;1，上级汇付Id不可传&lt;br/&gt;如果headOfficeFlag&#x3D;0，useHeadInfoFlag&#x3D;Y,且head_huifu_id不为空则基本信息部分复用上级的基本信息。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        params.put("head_huifu_id", "");
        // 商户ICP备案编号商户ICP备案编号或网站许可证号；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：沪ICP备06046402号-28 &lt;/font&gt;&lt;br/&gt;类型为PC网站时，且为企业商户，且开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填
        params.put("mer_icp", "ttnndyxt.com");
        // 店铺门头照
        params.put("store_header_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 店铺内景/工作区域照
        params.put("store_indoor_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");
        // 店铺收银台/公司前台照
        params.put("store_cashier_desk_pic", "f6fc539b-73ff-3645-8539-ad318971cc48");

        // 功能编码：将点号在底层转换为斜杠路径 v2/merchant/basicdata/ent
        String funcCode = "v2.merchant.basicdata.ent";

        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }

}