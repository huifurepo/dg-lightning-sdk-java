package com.huifu.dg.lightning.biz.upload;

import com.huifu.dg.lightning.biz.client.BasePayClient;
import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;
import com.huifu.dg.lightning.biz.mer.config.DemoTestConstants;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class SupplementaryPictureUploadDemo {

    public static void main(String[] args) throws Exception {
        BasePay.debug = true;
        BasePay.prodMode = BasePay.MODE_PROD;
        MerConfig merConfig = new MerConfig();
        merConfig.setProductId(DemoTestConstants.DEMO_PRODUCT_ID);
        merConfig.setSysId(DemoTestConstants.DEMO_SYS_ID);
        merConfig.setRsaPrivateKey(DemoTestConstants.DEMO_RSA_PRIVATE_KEY);
        merConfig.setRsaPublicKey(DemoTestConstants.DEMO_RSA_PUBLIC_KEY);
        BasePay.initWithMerConfig(merConfig);

        Map<String, Object> params = new HashMap<>();
        params.put("req_date", DateTools.getCurrentDateYYYYMMDD());
        params.put("req_seq_id", SequenceTools.getReqSeqId32());
        params.put("huifu_id",  args.length > 0 ? args[0] : "6666000132294252");
        params.put("file_type",  args.length > 1 ? args[1] : "F07");
        params.put("picture",  args.length > 2 ? args[2] : "图片名称");
        String funcCode = "v2.supplementary.picture";
        Map<String, Object> result = BasePayClient.upload(params, new File("/Users/cc/temp/105105.png"), funcCode);
        System.out.println(result);
    }
}
