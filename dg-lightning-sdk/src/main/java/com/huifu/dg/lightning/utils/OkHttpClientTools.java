package com.huifu.dg.lightning.utils;


import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.biz.exception.BasePayException;
import com.huifu.dg.lightning.biz.exception.FailureCode;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static com.huifu.dg.lightning.biz.net.AbstractRequest.SDK_VERSION;

/**
 *
 */
public class OkHttpClientTools {

    private static int readTimeout = 20000;

    private static int connectTimout = 20000;

    private static int writeTimeout = 30000;

    private static final int SUCCESS_CODE = 200;

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    /**
     * @param url
     * @param jsonData
     * @param productId
     * @return
     * @throws BasePayException
     */
    public static String httpPost(String url, String jsonData, String productId) throws BasePayException {

        try {

            RequestBody body = RequestBody.create(jsonData, JSON);
            MerConfig merConfig = BasePay.getConfig("default");

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomConnectTimeout).orElse(connectTimout), TimeUnit.MILLISECONDS)   // 设置连接超时时间
                    .readTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomReadtTimeout).orElse(readTimeout), TimeUnit.MILLISECONDS) // 设置读取超时时间
                    .writeTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomWriteTimeout).orElse(writeTimeout), TimeUnit.MILLISECONDS)
                    .build();

            Request.Builder builder = new Request.Builder()
                    .url(url)
                    .addHeader("format", "JSON")
                    .addHeader("charset", "UTF-8")
                    .addHeader("sdk_version", "javaSDK_lightning_" + SDK_VERSION)
                    .addHeader("product_id", productId)
                    .addHeader("Accept", "application/json;charset=utf-8")
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .post(body);

            Call call = client.newCall(builder.build());
            try {

                Response response = call.execute();

                int statusCode = response.code();
                if (SUCCESS_CODE != statusCode) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，response.code: ".concat(String.valueOf(statusCode)));
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request fail. response.code=".concat(String.valueOf(statusCode)));
                }

                String responseData = response.body().string();
                if (StringUtils.isBlank(responseData)) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，调用下游系统返回结果为空: ");
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI_NULL.getFailureCode(), "post request huifu system fail, reponse data null.");
                }

                return responseData;

            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                    if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败，SocketTimeout");
                    }
                    throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request huifu system fail, socket timeout exception.");
                }
                if (e instanceof ConnectException) {
                    if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败， 建立连接超时");
                    }
                    throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request huifu system fail, connection timeout.");
                }
                if (BasePay.debug) {
                    System.out.println("POST请求汇付交易系统失败");
                }
                throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail,IOException.");
            }

        } catch (Exception e) {
            if (BasePay.debug) {
                System.out.println("POST请求汇付交易系统失败");
            }
            throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
        }

    }

    /**
     * @param url
     * @param jsonData
     * @param productId
     * @param file
     * @return
     * @throws BasePayException
     */
    public static String httpPostFile(String url, String jsonData, String productId, File file) throws BasePayException {

        try {

            if (file == null || !file.exists()) {
                return "文件不能为空";
            }

            RequestBody body = RequestBody.create(jsonData, JSON);
            RequestBody fileBody = RequestBody.create(file, JSON);
            MerConfig merConfig = BasePay.getConfig("default");

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomConnectTimeout).orElse(connectTimout), TimeUnit.MILLISECONDS)   // 设置连接超时时间
                    .readTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomReadtTimeout).orElse(readTimeout), TimeUnit.MILLISECONDS) // 设置读取超时时间
                    .writeTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomWriteTimeout).orElse(writeTimeout), TimeUnit.MILLISECONDS)
                    .build();

            RequestBody multipartBody = new MultipartBody.Builder().setType(MultipartBody.ALTERNATIVE)
                    .addFormDataPart("file", file.getName(), fileBody)
                    .addPart(body)
                    .build();

            Request.Builder builder = new Request.Builder()
                    .url(url)
                    .addHeader("format", "JSON")
                    .addHeader("charset", "UTF-8")
                    .addHeader("sdk_version", "javaSDK_lightning_" + SDK_VERSION)
                    .addHeader("product_id", productId)
                    .addHeader("Accept", "application/json;charset=utf-8")
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .post(multipartBody);

            Call call = client.newCall(builder.build());
            try {

                Response response = call.execute();

                int statusCode = response.code();
                if (SUCCESS_CODE != statusCode) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，response.code: ".concat(String.valueOf(statusCode)));
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request fail. response.code=".concat(String.valueOf(statusCode)));
                }

                String responseData = response.body().string();
                if (StringUtils.isBlank(responseData)) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，调用下游系统返回结果为空: ");
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI_NULL.getFailureCode(), "post request huifu system fail, reponse data null.");
                }

                return responseData;

            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                    if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败，SocketTimeout");
                    }
                    throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request huifu system fail, socket timeout exception.");
                }
                if (e instanceof ConnectException) {
                    if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败， 建立连接超时");
                    }
                    throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request huifu system fail, connection timeout.");
                }
                if (BasePay.debug) {
                    System.out.println("POST请求汇付交易系统失败");
                }
                throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail, IOException.");
            }

        } catch (Exception e) {
            if (BasePay.debug) {
                System.out.println("POST请求汇付交易系统失败");
            }
            throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
        }

    }

    /**
     * @param url
     * @param jsonData
     * @param productId
     * @return
     * @throws BasePayException
     */
    public static String httpGet(String url, String jsonData, String productId) throws BasePayException {

        try {

            RequestBody body = RequestBody.create(jsonData, JSON);

            MerConfig merConfig = BasePay.getConfig("default");
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomConnectTimeout).orElse(connectTimout), TimeUnit.MILLISECONDS)   // 设置连接超时时间
                    .readTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomReadtTimeout).orElse(readTimeout), TimeUnit.MILLISECONDS) // 设置读取超时时间
                    .writeTimeout(Optional.ofNullable(merConfig).map(MerConfig::getCustomWriteTimeout).orElse(writeTimeout), TimeUnit.MILLISECONDS)
                    .build();

            Request.Builder builder = new Request.Builder()
                    .url(url)
                    .patch(body)
                    .addHeader("format", "JSON")
                    .addHeader("charset", "UTF-8")
                    .addHeader("sdk_version", "javaSDK_lightning_" + SDK_VERSION)
                    .addHeader("product_id", productId)
                    .addHeader("Accept", "application/json;charset=utf-8")
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .get();

            Call call = client.newCall(builder.build());
            try {

                Response response = call.execute();

                int statusCode = response.code();
                if (SUCCESS_CODE != statusCode) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，response.code: ".concat(String.valueOf(statusCode)));
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request fail. response.code=".concat(String.valueOf(statusCode)));
                }

                String responseData = response.body().string();
                if (StringUtils.isBlank(responseData)) {
                    if (BasePay.debug) {
                        System.out.println("POST请求失败，调用下游系统返回结果为空: ");
                    }
                    throw new BasePayException(FailureCode.POST_REQUEST_FALI_NULL.getFailureCode(), "post request huifu system fail, reponse data null.");
                }

                return responseData;

            } catch (IOException e) {
                if (e instanceof SocketTimeoutException) {
                    if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败，SocketTimeout");
                    }
                    throw new BasePayException(FailureCode.SOCKET_TIME_EXCEPTION.getFailureCode(), "post request huifu system fail, socket timeout exception.");
                }
                if (e instanceof ConnectException) {
                    if (BasePay.debug) {
                        System.out.println("POST请求汇付交易系统失败， 建立连接超时");
                    }
                    throw new BasePayException(FailureCode.CONNECT_EXCEPTION.getFailureCode(), "post request huifu system fail, connection timeout.");
                }
                if (BasePay.debug) {
                    System.out.println("POST请求汇付交易系统失败");
                }
                throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
            }

        } catch (Exception e) {
            if (BasePay.debug) {
                System.out.println("POST请求汇付交易系统失败");
            }
            throw new BasePayException(FailureCode.POST_REQUEST_FALI.getFailureCode(), "post request huifu system fail.");
        }

    }

}