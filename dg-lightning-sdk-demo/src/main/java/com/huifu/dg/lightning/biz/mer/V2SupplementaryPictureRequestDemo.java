package com.huifu.dg.lightning.biz.mer;


import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.request.V2SupplementaryPictureRequest;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.dg.lightning.biz.mer.config.BaseCommonDemo;
import com.huifu.dg.lightning.biz.mer.config.OppsMerchantConfigDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


/**
 * 依赖 dg-java-sdk
 * @description 图片上传 - 示例
 */
public class V2SupplementaryPictureRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2SupplementaryPictureRequest request = new V2SupplementaryPictureRequest();
        // 业务请求流水号
        request.setReqSeqId("202511131542560097f56vv9izkki43");
        // 业务请求日期
        request.setReqDate("20251113");
        // 图片类型
        request.setFileType("F07");
        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request,  new File("/Users/cc/temp/105105.png"));

        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 商户号
        extendInfoMap.put("huifu_id", "6666000132294252");
        // 图片名称
        extendInfoMap.put("picture","图片名称");
        return extendInfoMap;
    }

}
