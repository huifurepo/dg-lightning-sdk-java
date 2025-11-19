package com.huifu.dg.lightning.biz.mer;

import com.huifu.dg.lightning.biz.client.BasePayClient;
import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;
import com.huifu.dg.lightning.biz.mer.config.DemoTestConstants;

import java.util.HashMap;
import java.util.Map;

public class MerchantBasicdataQueryDemo {

    public static void main(String[] args) throws Exception {
        // 启用调试日志，便于观察请求与响应
        BasePay.debug = true;
        // 设置为生产模式，保持与SupplementaryPictureUploadDemo一致
        BasePay.prodMode = BasePay.MODE_PROD;

        // 初始化商户配置（产品号、系统号、RSA密钥），保持与SupplementaryPictureUploadDemo一致
        MerConfig merConfig = new MerConfig();
        merConfig.setProductId(DemoTestConstants.DEMO_PRODUCT_ID);
        merConfig.setSysId(DemoTestConstants.DEMO_SYS_ID);
        merConfig.setRsaPrivateKey(DemoTestConstants.DEMO_RSA_PRIVATE_KEY);
        merConfig.setRsaPublicKey(DemoTestConstants.DEMO_RSA_PUBLIC_KEY);
        BasePay.initWithMerConfig(merConfig);

        // 组装业务参数data（按照接口必填字段）
        Map<String, Object> params = new HashMap<>();
        // 请求日期，格式yyyyMMdd
        params.put("req_date", DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号，当天唯一，自动生成32位随机值
        params.put("req_seq_id", SequenceTools.getReqSeqId32());
        // 目标查询的汇付客户ID，可从命令行参数传入
        params.put("huifu_id", args.length > 0 ? args[0] : "6666000108854952");

        // 功能编码：将点号在底层转换为斜杠路径 v2/merchant/basicdata/query

        String funcCode = "v2.merchant.basicdata.query";

        // 直接发起请求：底层会自动构造 {sys_id, product_id, sign, data} 并进行加签
        Map<String, Object> result = BasePayClient.request(params, funcCode, false);
        System.out.println(result);
    }
}

