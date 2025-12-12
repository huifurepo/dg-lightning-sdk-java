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
 * @description  商户业务开通-示例
 */
public class MerchantBusiOpenDemo extends BaseCommonDemo {

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
        //协议
        params.put("agreement_info", "{\"agreement_type\":\"3\",\"sign_date\":\"\",\"agree_begin_date\":\"\",\"agree_end_date\":\"\",\"agreement_url\":\"https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/PaymentServiceAgreement.htm\"}");

        //业务异步通知地址
        params.put("busi_async_return_url","http://192.168.85.157:30031/sspm/testVirgo");
        //支付宝
        params.put("ali_conf_list","[{\"pay_scene\":\"1\",\"fee_rate\":\"1\",\"fee_min_amt\":\"1\",\"pay_channel_id\":\"JQF00001\"}]");
        //微信
        params.put("wx_conf_list","[{\"pay_scene\":\"1\",\"fee_rate\":\"0.02\",\"fee_min_amt\":\"0.02\",\"pay_channel_id\":\"JQF00001\",\"fee_rule_id\":\"758\",\"service_codes\":\"\",\"is_check_real_name\":\"\"}]");
        //银联二维码
        params.put("union_conf_list","[{\"credit_fee_rate_up\":\"0.550\",\"debit_fee_rate_up\":\"0.500\",\"credit_fee_rate_down\":\"0.250\",\"debit_fee_limit_up\":\"25.000\",\"mcc\":\"5094\",\"debit_fee_rate_down\":\"0.250\"}]");
        //pos刷卡
        params.put("bank_card_conf","{\"switch_state\":1,\"debit_fee_rate\":\"0.45\",\"debit_fee_limit\":\"20.00\",\"credit_fee_rate\":\"0.53\",\"mcc\":\"7911\"}");
        //余额支付
        params.put("balance_pay_config","{\"fee_rate\":\"13\",\"fee_fix_amt\":\"0.02\",\"out_fee_acct_type\":\"01\",\"out_fee_huifuid\":\"111\",\"out_fee_flag\":\"2\",\"balance_model\":\"2\",\"description_info\":{\"busi_instruction\":\"1\",\"capital_instruction\":\"1\",\"function_instruction\":\"1\"}}");
        //分账
        params.put("split_conf_info","{\"div_flag\":\"Y\",\"rule_origin\":\"01\",\"apply_ratio\":\"90\",\"start_type\":\"0\",\"split_fee_rate\":\"0.02\",\"per_amt\":\"0.02\",\"scene\":\"00\",\"split_ext_info\":{\"busi_instruction\":\"1\",\"capital_instruction\":\"1\",\"function_instruction\":\"1\"}}");
        //补充文件信息
        params.put("extended_material_list","[{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F454\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F455\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F456\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F457\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F460\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F442\"}," +
                "{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F346\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F338\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F447\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F448\"},{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_type\":\"F449\"}]");
        // 功能编码：将点号在底层转换为斜杠路径 /v2/merchant/busi/open
        String funcCode = "v2.merchant.busi.open";
        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }

}