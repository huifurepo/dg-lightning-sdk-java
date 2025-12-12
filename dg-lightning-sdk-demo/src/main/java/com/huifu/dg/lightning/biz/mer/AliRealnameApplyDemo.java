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
 * @date 2025/11/25 17:35
 * @description  支付宝实名申请-示例
 */
public class AliRealnameApplyDemo extends BaseCommonDemo {

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
        // 商户号
        params.put("huifu_id", "6666000109187253");
        //联系人信息
        params.put("contact_person_info", "{\"name\":\"谢季\",\"mobile\":\"18900400032\",\"id_card_number\":\"120103198507275017\"}");
        //法人身份信息
        params.put("legal_person_info", "{\"legal_type\":\"SUPER\",\"card_type\":\"00\",\"person_name\":\"李四\",\"card_no\":\"110101199909291419\",\"effect_time\":\"19990101\",\"expire_time\":\"长期\",\"card_front_img\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"card_back_img\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"auth_letter_img\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"is_benefit_person\":\"N\"}");
        //主体信息
        params.put("auth_identity_info", "{\"finance_license_pics\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"financial_type\":\"INST\",\"business_type\":\"2\",\"qualification_info_list\":\"[{\\\"mcc_code\\\":\\\"5521\\\",\\\"image_list\\\":\\\"f6fc539b-73ff-3645-8539-ad318971cc48\\\"}]\",\"finance_institution_flag\":\"N\",\"certificate_type\":\"BUSINESS_CERT\",\"company_prove_copy\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"certificate_info\":\"{\\\"cert_number\\\":\\\"9111000071093465XC\\\",\\\"cert_type\\\":\\\"CERTIFICATE_TYPE_2389\\\",\\\"expire_time\\\":\\\"长期\\\",\\\"cert_legal_person\\\":\\\"李四\\\",\\\"cert_company_address\\\":\\\"浙江省杭州市西湖区1街道10号\\\",\\\"cert_merchant_name\\\":\\\"新新饭店\\\",\\\"cert_copy\\\":\\\"f6fc539b-73ff-3645-8539-ad318971cc48\\\",\\\"effect_time\\\":\\\"19990101\\\"}\",\"support_credentials\":\"{\\\"province\\\":\\\"上海\\\",\\\"store_door_img\\\":\\\"f6fc539b-73ff-3645-8539-ad318971cc48\\\",\\\"city\\\":\\\"上海市\\\",\\\"district_code\\\":\\\"310107\\\",\\\"micro_biz_type\\\":\\\"MICRO_TYPE_STORE\\\",\\\"district\\\":\\\"普陀区\\\",\\\"store_inner_img\\\":\\\"f6fc539b-73ff-3645-8539-ad318971cc48\\\",\\\"store_name\\\":\\\"张三\\\",\\\"city_code\\\":\\\"310100\\\",\\\"store_address\\\":\\\"消息路\\\",\\\"province_code\\\":\\\"310000\\\"}\"}");
        //受益人信息
        params.put("ubo_info", "{\"ubo_id_doc_name\":\"消化\",\"ubo_id_doc_type\":\"00\",\"ubo_id_doc_number\":\"110101199909291419\",\"ubo_period_begin\":\"19990101\",\"ubo_period_end\":\"20260606\",\"ubo_id_doc_copy\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"ubo_id_doc_copy_back\":\"f6fc539b-73ff-3645-8539-ad318971cc48\"}");
        // 功能编码：将点号在底层转换为斜杠路径 v2/merchant/busi/ali/realname/apply
        String funcCode = "v2.merchant.busi.ali.realname.apply";
        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }

}