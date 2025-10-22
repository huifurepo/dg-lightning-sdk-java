package com.huifu.dg.lightning.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Map;

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
        // 序列化时忽略为 null 的属性
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static ObjectMapper getInstance() {
        return objectMapper;
    }

    public static <T> T convert2Object(Map<String, Object> map, Class<T> clazz) throws Exception {
        return objectMapper.convertValue(map, clazz);
    }

    public static String convert2JsonString(Object obj) throws Exception {
        return  obj instanceof String ? (String) obj :objectMapper.writeValueAsString(obj);
    }

}
