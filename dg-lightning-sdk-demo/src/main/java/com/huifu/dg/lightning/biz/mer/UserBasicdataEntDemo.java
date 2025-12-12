package com.huifu.dg.lightning.biz.mer;

import com.huifu.dg.lightning.biz.client.BasePayClient;
import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.biz.mer.config.BaseCommonDemo;
import com.huifu.dg.lightning.biz.mer.config.DemoTestConstants;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.HashMap;
import java.util.Map;

/**
 * @author meisheng.han
 * @date 2025/11/28 17:35
 * @description  企业用户户进件-示例
 */
public class UserBasicdataEntDemo extends BaseCommonDemo {

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
        
        // 企业用基本信息
        params.put("reg_name", "企业商户名称8225"); // 企业用户名称
        params.put("short_name", "企业商户"); // 经营简称
        params.put("license_code", "20220222013747149"); // 营业执照编号
        params.put("license_validity_type", "1"); // 证照有效期类型
        params.put("license_begin_date", "20200117"); // 证照有效期起始日期
        params.put("license_end_date", "20400117"); // 证照有效期结束日期
        params.put("reg_prov_id", "310000"); // 注册地址(省)
        params.put("reg_area_id", "310100"); // 注册地址(市)
        params.put("reg_district_id", "310104"); // 注册地址(区)
        params.put("reg_detail", "上海市宜山路"); // 注册地址(详细信息)
        params.put("legal_name", "黄云"); // 法人姓名
        params.put("legal_cert_type", "00"); // 法人证件类型
        params.put("legal_cert_no", "350500197903100512"); // 法人证件号码
        params.put("legal_cert_validity_type", "1"); // 法人证件有效期类型
        params.put("legal_cert_begin_date", "20120801"); // 法人证件有效期开始日期
        params.put("legal_cert_end_date", "20300801"); // 法人证件有效期截止日期
        params.put("contact_name", "小的"); // 联系人姓名
        params.put("contact_mobile", "13764462211"); // 联系人手机号
        params.put("contact_email", "jeff.peng@huifu.com"); // 联系人电子邮箱
        params.put("login_name", SequenceTools.getReqSeqId32()); // 管理员账号
        params.put("operator_id", ""); // 操作员
        params.put("sms_send_flag", "1");
        params.put("expand_id", "");

        // 功能编码：将点号在底层转换为斜杠路径 v2/user/basicdata/ent
        String funcCode = "v2.user.basicdata.ent";

        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }

}