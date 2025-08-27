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
     * 交易设备GPS
     */
    @JsonProperty("device_gps")
    String deviceGps;
    /**
     * 交易设备IMEI
     */
    @JsonProperty("device_imei")
    String deviceImei;
    /**
     * 交易设备IMSI
     */
    @JsonProperty("device_imsi")
    String deviceImsi;
    /**
     * 交易设备ICCID
     */
    @JsonProperty("device_icc_id")
    String deviceIccId;
    /**
     * 交易设备WIFIMAC
     */
    @JsonProperty("device_wifi_mac")
    String deviceWifiMac;
    /**
     * 终端应用版本
     */
    @JsonProperty("app_version")
    String appVersion;
    /**
     * SIM卡卡号
     */
    @JsonProperty("icc_id")
    String iccId;
    /**
     * 终端经纬度
     */
    @JsonProperty("location")
    String location;
    /**
     * 商户设备IP
     */
    @JsonProperty("mer_device_ip")
    String merDeviceIp;
    /**
     * 商户设备类型
     */
    @JsonProperty("mer_device_type")
    String merDeviceType;
    /**
     * 移动国家代码
     */
    @JsonProperty("mobile_country_cd")
    String mobileCountryCd;
    /**
     * 移动网络号码
     */
    @JsonProperty("mobile_net_num")
    String mobileNetNum;
    /**
     * 入网认证编号
     */
    @JsonProperty("network_license")
    String networkLicense;
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

    public String getDeviceGps() {
        return deviceGps;
    }

    public void setDeviceGps(String deviceGps) {
        this.deviceGps = deviceGps;
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
    }

    public String getDeviceImsi() {
        return deviceImsi;
    }

    public void setDeviceImsi(String deviceImsi) {
        this.deviceImsi = deviceImsi;
    }

    public String getDeviceIccId() {
        return deviceIccId;
    }

    public void setDeviceIccId(String deviceIccId) {
        this.deviceIccId = deviceIccId;
    }

    public String getDeviceWifiMac() {
        return deviceWifiMac;
    }

    public void setDeviceWifiMac(String deviceWifiMac) {
        this.deviceWifiMac = deviceWifiMac;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getIccId() {
        return iccId;
    }

    public void setIccId(String iccId) {
        this.iccId = iccId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMerDeviceIp() {
        return merDeviceIp;
    }

    public void setMerDeviceIp(String merDeviceIp) {
        this.merDeviceIp = merDeviceIp;
    }

    public String getMerDeviceType() {
        return merDeviceType;
    }

    public void setMerDeviceType(String merDeviceType) {
        this.merDeviceType = merDeviceType;
    }

    public String getMobileCountryCd() {
        return mobileCountryCd;
    }

    public void setMobileCountryCd(String mobileCountryCd) {
        this.mobileCountryCd = mobileCountryCd;
    }

    public String getMobileNetNum() {
        return mobileNetNum;
    }

    public void setMobileNetNum(String mobileNetNum) {
        this.mobileNetNum = mobileNetNum;
    }

    public String getNetworkLicense() {
        return networkLicense;
    }

    public void setNetworkLicense(String networkLicense) {
        this.networkLicense = networkLicense;
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
