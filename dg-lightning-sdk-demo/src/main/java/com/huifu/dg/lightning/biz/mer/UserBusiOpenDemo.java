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
 * @description  用户业务入驻-示例
 */
public class UserBusiOpenDemo extends BaseCommonDemo {

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
        
        //用户huifuId
        params.put("huifu_id", "6666000109194441");
        //渠道商/商户汇付Id
        params.put("upper_huifu_id", "6666000108406684");
        //异步请求地址
        params.put("async_return_url", "");
        //结算卡信息
        params.put("card_info", "{\"card_type\":\"0\",\"card_name\":\"交通银行股份有限公司\",\"card_no\":\"6217001210064762121\",\"prov_id\":\"310000\",\"area_id\":\"310100\",\"bank_code\":\"01050000\",\"branch_code\":\"105305264815\",\"branch_name\":\"中国建设银行股份有限公司上海平凉路支行\",\"cert_type\":\"00\",\"cert_no\":\"110101197003077513\",\"cert_validity_type\":\"0\",\"cert_begin_date\":\"20210806\",\"cert_end_date\":\"20410806\",\"mp\":\"15556622368\"}");
        //结算信息
        params.put("settle_config", "{\"settle_cycle\":\"D1\",\"min_amt\":\"0.01\",\"remained_amt\":\"10.00\",\"settle_abstract\":\"结算摘要\",\"out_settle_flag\":\"2\",\"out_settle_huifuid\":\"\",\"out_settle_acct_type\":\"\",\"fixed_ratio\":\"2\",\"settle_batch_no\":\"300\",\"settle_pattern\":\"\",\"is_priority_receipt\":\"\",\"settle_time\":\"\"}");
        //取现信息
        params.put("cash_config", "[{\"cash_type\":\"D1\",\"fix_amt\":\"0.03\",\"fee_rate\":\"2\",\"out_fee_flag\":\"\",\"out_fee_huifu_id\":\"\",\"out_fee_acct_type\":\"\"}]");
        //文件列表
        params.put("file_list", "[{\"file_id\":\"f6fc539b-73ff-3645-8539-ad318971cc48\",\"file_name\":\"企业营业执照1.jpg\",\"file_type\":\"F02\"}]");

        // 功能编码：将点号在底层转换为斜杠路径 v2/user/busi/open
        String funcCode = "v2.user.busi.open";

        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }

}