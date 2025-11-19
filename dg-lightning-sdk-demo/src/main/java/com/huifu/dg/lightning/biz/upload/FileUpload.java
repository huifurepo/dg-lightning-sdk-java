package com.huifu.dg.lightning.biz.upload;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.alibaba.fastjson.JSON;

/**
 * https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc?id=%e5%9b%be%e7%89%87%e4%b8%8a%e4%bc%a0
 * 官方API上的例子
 */
public class FileUpload {

    public static void main(String[] args) throws Exception {
        //图片上传接口地址
        String url = "https://api.huifu.com/v2/supplementary/picture";
        // 请求参数
        Map<String, Object> params = new HashMap<String, Object>();
        // 请求流水号，需保证当天商户下唯一，推荐采用日期时间+几位流水号的形式
        params.put("req_seq_id", "20230530001");
        params.put("req_date", "20230530");
        params.put("file_type", "F07");
        //如果商户还未成功进件huifu_id可以为空
        params.put("huifu_id", "6666000132294252");
        String data = JSON.toJSONString(params);
        String localFile = "/Users/cc/temp/105105.png";
        File file = new File(localFile);

        CloseableHttpClient httpclient1 = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = null;

        try {
            HttpPost httpPost = new HttpPost(url);
            ContentType contentType = ContentType.create("text/plain", Charset.forName("UTF-8"));
            MultipartEntityBuilder mEntityBuilder = MultipartEntityBuilder.create();
            mEntityBuilder.addTextBody("sys_id", "6666000108840829", contentType);
            mEntityBuilder.addTextBody("product_id", "YYZY", contentType);
            mEntityBuilder.addTextBody("data", data, contentType);
            mEntityBuilder.addBinaryBody("file", file);

            httpPost.setEntity(mEntityBuilder.build());
            response = httpclient1.execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity resEntity = response.getEntity();
                result = EntityUtils.toString(resEntity);
                System.out.print(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
