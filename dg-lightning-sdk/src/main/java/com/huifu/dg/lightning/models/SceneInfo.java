package com.huifu.dg.lightning.models;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @description: 门店信息
 * @author: wang.hu_c
 * @date: 2025年08月20日
 */
public class SceneInfo implements Serializable {
    /**
     * 门店信息
     */
    @JSONField(name = "store_info")
    private StoreInfo storeInfo;

    public StoreInfo getStoreInfo() {
        return storeInfo;
    }

    public void setStoreInfo(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }
}

