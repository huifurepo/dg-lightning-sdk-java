package com.huifu.dg.lightning.biz.mer;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiOpenRequest;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.dg.lightning.biz.mer.config.BaseCommonDemo;
import com.huifu.dg.lightning.biz.mer.config.OppsMerchantConfigDemo;

import java.util.HashMap;
import java.util.Map;


/**
 * @author bo.dong
 * @date 2025/10/22 10:14
 * @description 商户业务开通 - 示例
 */
public class V2MerchantBusiOpenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiOpenRequest request = new V2MerchantBusiOpenRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000104778898");
        // 直属渠道号
        request.setUpperHuifuId("6666000003080000");
        // 签约人jsonObject格式；agreement_info中选择电子签约时必填；个人商户填本人信息。
        // request.setSignUserInfo(get9a8bdfc79ec84ae985f16fd1db5eabbd());
        // 线上业务类型编码基本信息入驻接口中scene_type&#x3D;ONLINE/ALL时必填；&lt;br/&gt;开通以下业务快捷、网银、余额支付、银行大额转账、分账比例&gt;30%需要提供补充材料，参见[线上业务类型编码及补充材料说明](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/kyc/KYC-%E7%BA%BF%E4%B8%8A%E4%B8%9A%E5%8A%A1%E7%B1%BB%E5%9E%8B%E7%BC%96%E7%A0%81%E5%8F%8A%E8%A1%A5%E5%85%85%E6%9D%90%E6%96%99%E8%AF%B4%E6%98%8E.xlsx)；材料通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传&lt;font color&#x3D;&quot;green&quot;&gt;示例值：H7999AL&lt;/font&gt;
        // request.setOnlineBusiType("test");
        // *协议信息实体*jsonObject字符串；[签约协议材料说明](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/kyc/KYC-%E5%95%86%E6%88%B7%E5%90%88%E5%90%8C%E7%AD%BE%E7%BA%A6%E8%A7%84%E5%88%99.xlsx) &lt;br/&gt;若未签署过协议的情况下，调用该接口时必填 ，且注册地址或经营地址为如下地区（江苏省、浙江省、湖南省、湖北省、云南省、贵州省、陕西省、河南省、吉林省、黑龙江省、福建省、海南省、重庆市、青海省、宁夏回族自治区）开通银联二维码或刷卡业务不支持挂网协议；&lt;br/&gt;若已签署过纸质或电子协议下，调用该接口时必填，且只可以选择纸质或电子协议；&lt;br/&gt;若已签署过挂网协议下，调用该接口时，选填。
        request.setAgreementInfo("{\"agreement_type\":\"0\"}");

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

        // 支付宝配置对象
        extendInfoMap.put("ali_conf_list","[{\"pay_scene\":\"1\",\"mcc\":\"5399\",\"fee_rate\":\"0.30\"}]");

        // 微信配置对象
        extendInfoMap.put("wx_conf_list","[{\"pay_scene\":\"2\",\"fee_min_amt\":\"0\",\"wx_real_name_info\":{\"cert_type\":\"CERTIFICATE_TYPE_2389\",\"contact_type\":\"LEGAL\"},\"is_check_real_name\":\"Y\",\"fee_rate\":\"0.30\"},{\"pay_scene\":\"3\",\"fee_min_amt\":\"0\",\"wx_real_name_info\":{\"cert_type\":\"CERTIFICATE_TYPE_2389\",\"contact_type\":\"LEGAL\"},\"is_check_real_name\":\"Y\",\"fee_rate\":\"0.30\"}]");


        // *余额支付配置*
        extendInfoMap.put("balance_pay_config", "{\"switch_state\":\"1\",\"fee_rate\":\"2\",\"fee_fix_amt\":\"1\"}");


        // 分账配置信息
         extendInfoMap.put("split_conf_info", "{\"div_flag\":\"Y\",\"per_amt\":\"0.00\",\"apply_ratio\":\"30.00\",\"rule_origin\":\"01\",\"split_fee_rate\":\"0.00\",\"start_type\":\"0\",\"scene\":\"A9\"}");
        // 延迟入账开关
        extendInfoMap.put("delay_flag", "Y");

        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "https://appletssz.bw.gzyzzckj.com/HfNotify/merchantBusiOpen");


        return extendInfoMap;
    }

}
