package com.huifu.dg.lightning.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author wang.hu_c
 * @date 2025/8/20 14:22
 * @Description 设备信息
 */
public class TerminalDeviceData implements Serializable {

    private static final long serialVersionUID = 2089045354814539809L;
    /**
     * 交易设备IP。
     */
    @JsonProperty("device_ip")
    String deviceIp;
    /**
     * 交易设备MAC
     */
    @JsonProperty("device_mac")
    String deviceMac;
    /**
     * 商户设备类型
     */
    @JsonProperty("mer_device_type")
    String merDeviceType;
    /**
     * 终端序列号
     */
    @JsonProperty("serial_num")
    String serialNum;
    /**
     * 汇付机具号
     */
    @JsonProperty("devs_id")
    String devsId;
    /**
     * 交易设备IP
     */
    @JsonProperty("terminal_ip")
    String terminalIp;
    /**
     * 终端经纬度
     */
    @JsonProperty("terminal_location")
    String terminalLocation;

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    public String getMerDeviceType() {
        return merDeviceType;
    }

    public void setMerDeviceType(String merDeviceType) {
        this.merDeviceType = merDeviceType;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getDevsId() {
        return devsId;
    }

    public void setDevsId(String devsId) {
        this.devsId = devsId;
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public String getTerminalLocation() {
        return terminalLocation;
    }

    public void setTerminalLocation(String terminalLocation) {
        this.terminalLocation = terminalLocation;
    }
}
