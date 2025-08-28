package com.huifu.dg.lightning.factory;

import com.huifu.dg.lightning.biz.client.CommonPayClient;

/**
 * @author bo.dong
 * @date 2025/7/24 14:01
 * @description
 */
public class Factory {


    public static class Payment {
        public Payment() {
        }

        public static CommonPayClient Common() throws Exception {
            return new CommonPayClient();
        }
    }
}
