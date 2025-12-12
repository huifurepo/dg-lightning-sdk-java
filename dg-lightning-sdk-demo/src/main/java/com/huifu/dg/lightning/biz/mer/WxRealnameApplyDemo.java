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
 * @description  微信实名申请-示例
 */
public class WxRealnameApplyDemo extends BaseCommonDemo {

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
        // 商户号
        params.put("huifu_id", "6666000109187253");
        params.put("name", "小枫");//联系人姓名
        params.put("mobile", "17521205027");//联系人手机号
        params.put("id_card_number", "130224198806083798");//联系人身份证
        params.put("cert_type", "CERTIFICATE_TYPE_2389"); // 证书类型
        params.put("cert_number", "1234567892"); // 证书编号
        params.put("micro_biz_type", ""); // 小微经营类型
        params.put("store_name", ""); // 门店名称
        params.put("store_address_code", ""); // 门店省市编码
        params.put("store_address", ""); // 门店地址
        params.put("store_header_copy", ""); // 门店门头照片
        params.put("store_indoor_copy", ""); // 店内环境照片
        params.put("identification_back_copy", "f6fc539b-73ff-3645-8539-ad318971cc48"); // 身份证国徽面
        params.put("identification_front_copy", "f6fc539b-73ff-3645-8539-ad318971cc48"); // 身份证人像面
        params.put("cert_copy", ""); // 证书照片
        params.put("company_prove_copy", ""); // 单位证明函照片
        params.put("contact_type", "SUPER");
        params.put("contact_id_doc_type", "01"); // 联系人证件类型
        params.put("contact_period_begin", "1990-03-07"); // 联系人证件有效期开始时间
        params.put("contact_period_end", "长期"); // 联系人证件有效期结束时间
        params.put("finance_institution_flag", "N");
        params.put("finance_type", "");
        params.put("category_id", "");//特殊行业id
        params.put("owner", "N");//经营者/法人是否为受益人
        params.put("identification_address", "上海市徐汇区宜山路789号789室");
        params.put("ubo_info_list", "[{\"ubo_id_doc_type\":\"00\",\"ubo_id_doc_copy\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"ubo_id_doc_copy_back\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"ubo_id_doc_name\":\"杨雷\",\"ubo_id_doc_number\":\"110101199003072631\",\"ubo_id_doc_address\":\"上海市徐汇区宜山路789号\",\"ubo_period_begin\":\"19900307\",\"ubo_period_end\":\"长期\"}]");
        //文件列表
        params.put("special_file_info_list", "[{\"file_type\":\"F33\",\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\"},{\"file_type\":\"F227\",\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\"}]");

        // 功能编码：将点号在底层转换为斜杠路径 v2/merchant/busi/realname
        String funcCode = "v2.merchant.busi.realname";
        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }

}