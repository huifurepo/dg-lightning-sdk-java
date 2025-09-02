package com.huifu.dg.lightning.biz.payment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundRequest;
import com.huifu.dg.lightning.models.TerminalDeviceData;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.JacksonUtils;

import java.util.Map;

/**
 * @description: 扫码交易退款
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class TradePaymentScanpayRefundTest {
    public static void transRefund() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayRefundRequest request = new TradePaymentScanpayRefundRequest();
        // 请求日期
        request.setReqDate("20250828");
        // 请求流水号
        request.setReqSeqId("20250828154349459562250tt");
        // 商户号
        request.setHuifuId("6666000104590764");
        request.setOrgReqDate("20250828");
        request.setOrgReqSeqId("20250828154349459562250");
        request.setOrdAmt("0.50");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("terminal_device_data", getTerminalDeviceData())
                .refund(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));
    }

    private static String getTerminalDeviceData() throws Exception{
        TerminalDeviceData terminalDeviceData = new TerminalDeviceData();
        terminalDeviceData.setDeviceIp("172.28.52.52");
        terminalDeviceData.setDevsId("660035730205200164801");
        terminalDeviceData.setLocation("+37.12/-121.213");
        terminalDeviceData.setMerDeviceIp("172.28.52.52");
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        return objectMapper.writeValueAsString(terminalDeviceData);
    }


    public static void main(String[] args) throws Exception {
        transRefund();
    }
}
