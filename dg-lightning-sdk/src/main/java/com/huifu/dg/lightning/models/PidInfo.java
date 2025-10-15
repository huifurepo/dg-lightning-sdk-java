package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @description: 服务商信息
 * @author: wang.hu_c
 * @date: 2025年08月21日
 */
public class PidInfo implements Serializable {
    /**
     * 服务商订单编号
     */
    @JsonProperty("pnr_order_id")
    private StoreInfo pnrOrderId;
    /**
     * 服务商密文
     */
    @JsonProperty("pid_sct")
    private StoreInfo pidSct;
    /**
     * 场景标识
     */
    @JsonProperty("trade_scene")
    private StoreInfo tradeScene;

    public StoreInfo getPnrOrderId() {
        return pnrOrderId;
    }

    public void setPnrOrderId(StoreInfo pnrOrderId) {
        this.pnrOrderId = pnrOrderId;
    }

    public StoreInfo getPidSct() {
        return pidSct;
    }

    public void setPidSct(StoreInfo pidSct) {
        this.pidSct = pidSct;
    }

    public StoreInfo getTradeScene() {
        return tradeScene;
    }

    public void setTradeScene(StoreInfo tradeScene) {
        this.tradeScene = tradeScene;
    }
}
