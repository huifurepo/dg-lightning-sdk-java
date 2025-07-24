package com.huifu.dg.lightning.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author bo.dong
 * @date 2025/7/23 10:33
 * @description
 */
public class JacksonUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        // 全局配置（仅需设置一次）
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public static ObjectMapper getInstance() {
        return objectMapper;
    }
}
