package com.huifu.dg.lightning.biz.mer;


import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.request.V2SupplementaryPictureRequest;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.dg.lightning.biz.mer.config.BaseCommonDemo;
import com.huifu.dg.lightning.biz.mer.config.OppsMerchantConfigDemo;

import java.util.HashMap;
import java.util.Map;


/**
 * @author bo.dong
 * @date 2025/10/22 09:26
 * @description 图片上传 - 示例
 */
public class V2SupplementaryPictureRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2SupplementaryPictureRequest request = new V2SupplementaryPictureRequest();
        // 业务请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 业务请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 图片类型
        request.setFileType("F01");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request, null);
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
        extendInfoMap.put("huifu_id", "6666000103413615");
        // 文件url链接
        extendInfoMap.put("file_url", "https://example.com/image.jpg");
        return extendInfoMap;
    }

}
