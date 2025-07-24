package com.huifu.dg.lightning.utils;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.TreeMap;

/**
 * json工具类;
 *
 * @author Frank Wang
 * @date 2021/9/2
 */
public class JsonUtils {
    /**
     * 对json string进行排序, 排序规则如下:
     * (1). 如果是对象, 则对对象中的所有的基本数据类型的属性按名称的ASCII升序排序;
     * (2). 如果是数组, 数组里面的item不进行排序;
     * (3). 若数组里面包含有对象,请参照规则1.
     *
     * @param sourceJson json字符串;
     * @param maxLayer   json允许的最大嵌套层数;
     * @return 排序好的json字符串.
     */
    public static String sort4JsonString(String sourceJson, int maxLayer) throws Exception {
        if (StringUtils.isBlank(sourceJson)) {
            return "";
        }
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        JsonNode rootNode = objectMapper.readTree(sourceJson);
        if (rootNode.isObject()) {
            ObjectNode objectNode = (ObjectNode) rootNode;
            Map<String, JsonNode> sortedMap = new TreeMap<>();
            objectNode.fields().forEachRemaining(entry ->
                    sortedMap.put(entry.getKey(), entry.getValue()));
            //清空原对象并按序添加属性
            objectNode.removeAll();
            sortedMap.forEach(objectNode::set);
            //处理嵌套
            if (maxLayer > 0) {
                for (Map.Entry<String, JsonNode> entry : sortedMap.entrySet()) {
                    if (entry.getValue().isArray()) {
                        sortJsonArray(entry.getValue(), 1, maxLayer);
                    }
                }
            }

        }
        //若根节点是数组，直接处理
        else if (rootNode.isArray() && maxLayer > 0) {
            sortJsonArray(rootNode, 1, maxLayer);
        }
        return objectMapper.writeValueAsString(rootNode);
    }


    // Map m = JSONObject.parseObject(sourceJson, TreeMap.class);

     /*   if (maxLayer > 0) {
            //对array中的元素顺序进行单独处理;
            for (Iterator it = m.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry entry = (Map.Entry) it.next();

                int layer = 0;

                JsonNode root = objectMapper.readTree(entry.getValue());

                if (entry.getValue() instanceof JSONArray) {
                    JSONArray array = (JSONArray) entry.getValue();

                    sortJsonArray(array, ++layer, maxLayer);
                }
            }
        }
         return JSON.toJSONString(m);
    }
*/

    /**
     * 对json Array中的对象进行排序, 基础数据类型不排序.
     * <p>
     * 如果有嵌套, 则递归进行排序.
     *
     * @param node     JsonNode.
     * @param layer    json的当前处理的嵌套层数
     * @param maxLayer json允许最大嵌套层数.
     */

    public static void sortJsonArray(JsonNode node, int layer, int maxLayer) throws Exception {
        if (layer >= maxLayer) {
            throw new Exception(String.format("json嵌套层数不超过 %d 层.", maxLayer));
        }

        if (node.isArray()) {
            ArrayNode arrayNode = (ArrayNode) node;
            // 处理数组中的每个元素
            for (int i = 0; i < arrayNode.size(); i++) {
                JsonNode element = arrayNode.get(i);
                if (element.isArray()) {
                    // 递归处理嵌套数组
                    sortJsonArray(element, layer + 1, maxLayer);
                } else if (element.isObject()) {
                    // 转换ObjectNode为有序Map并重新设置
                    ObjectNode objectNode = (ObjectNode) element;
                    Map<String, JsonNode> sortedMap = new TreeMap<>();
                    objectNode.fields().forEachRemaining(entry ->
                            sortedMap.put(entry.getKey(), entry.getValue())
                    );

                    // 清空原对象并按序添加属性
                    objectNode.removeAll();
                    sortedMap.forEach(objectNode::set);

                    // 递归处理对象中的嵌套数组
                    for (Map.Entry<String, JsonNode> entry : sortedMap.entrySet()) {
                        if (entry.getValue().isArray()) {
                            sortJsonArray(entry.getValue(), layer + 1, maxLayer);
                        }
                    }
                }
            }
        }
    }

/*    private static void sortJsonArray(JSONArray array, int layer, int maxLayer) throws Exception {
        if (layer >= maxLayer) {
            throw new Exception(String.format("json嵌套层数不超过 %d 层.", maxLayer));
        }

        for (int i = 0; i < array.size(); i++) {
            //如果数组中嵌套数组, 则递归排序;
            if (array.get(i) instanceof JSONArray) {
                sortJsonArray((JSONArray) array.get(i), ++layer, maxLayer);
            } else if (!(array.get(i) instanceof Comparable)) {
                //对数组中的对象进行排序;
                Map map = JSON.parseObject(array.get(i).toString(), TreeMap.class);
                array.set(i, map);

                //如果对象中嵌套有数组, 则递归处理;
                for (Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
                    Map.Entry entry = (Map.Entry) it.next();

                    if (entry.getValue() instanceof JSONArray) {
                        sortJsonArray((JSONArray) entry.getValue(), ++layer, maxLayer);
                    }
                }
            }
        }
    }*/

    public static void main(String[] args) throws Exception {
        String s1 = "{\"array2\": [1,8,\"cherry\",3,\"apple\",0,{\"value\":\"lemon\",\"key\":\"yellow\"}],\"array\": [{\"value\":\"v2\",\"key\":\"k2\"},{\"value\":\"v1\",\"key\":\"k1\"}],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\"}";
        String s2 = "{\"array2\": [1,8,\"cherry\",3,\"apple\",0,{\"value\":\"lemon\",\"key\":\"yellow\",\"data\":[{\"name\":\"frank\",\"age\":25,\"colors\":[{\"name\":\"name\",\"color\":\"red\"}]}]}],\"array\": [{\"value\":\"v2\",\"key\":\"k2\"},{\"value\":\"v1\",\"key\":\"k1\"}],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\"}";
        String s3 = "{\"array2\": [1,8,3,0],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\"}";

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1 * 1; i++) {
            //动态json;
            //String s2 = "{\"array2\": [1,8,\"cherry\",3,\"apple\",0,{\"value\":\"lemon\",\"key\":\"yellow\",\"data\":[{\"name\":\"frank\",\"age\":25,\"colors\":[{\"name\":\"name\",\"color\":\"red\"}]}]}],\"array\": [{\"value\":\"v2\",\"key\":\"k2\"},{\"value\":\"v1\",\"key\":\"k1\"}],\"boolean\": true,\"null\": null,\"number\": 123,\"object\": {\"a\": \"a\",\"c\": \"c\",\"b\": \"b\"},\"string\": \"Hello World\",\"ts\":" + System.currentTimeMillis() + "}";

            sort4JsonString(s2, 4);
            System.out.println(sort4JsonString(s2, 4));
        }
        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);
    }
}

