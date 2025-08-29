package com.huifu.dg.lightning.biz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huifu.dg.lightning.biz.exception.BasePayException;
import com.huifu.dg.lightning.biz.exception.FailureCode;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AggregateTransRequest;
import com.huifu.dg.lightning.models.AlipayData;
import com.huifu.dg.lightning.models.TerminalDeviceData;
import com.huifu.dg.lightning.models.UnionpayData;
import com.huifu.dg.lightning.models.WxData;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.JacksonUtils;
import com.huifu.dg.lightning.utils.SequenceTools;
import com.huifu.dg.lightning.utils.enums.PaymentTypeEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @description: 聚合支付
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
public class AggregateTransTest {

    public static void pay() throws Exception {
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig());
        AggregateTransRequest request = new AggregateTransRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000103334211");
        // 商品描述
        request.setGoodsDesc("支付宝Native");
        // 交易类型
        request.setTradeType("A_NATIVE");
        // 交易金额
        request.setTransAmt("0.01");
        request.setDelayAcctFlag("N");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", getMethodExpand(request.getTradeType()))
                .optional("terminal_device_data", getTerminalDeviceData())
                .create(request);
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        System.out.println("返回数据:" + objectMapper.writeValueAsString(response));

    }

    private static Object getTerminalDeviceData() {
        TerminalDeviceData terminalDeviceData = new TerminalDeviceData();
        terminalDeviceData.setDeviceIp("172.28.52.52");
        terminalDeviceData.setDevsId("SPINTP351420900692801");
        return terminalDeviceData;
    }

    private static String getMethodExpand(String tradeType) throws Exception{
        if (StringUtils.isBlank(tradeType)) {
            throw new BasePayException(FailureCode.REQUEST_PARAMETER_ERROR);
        }
        ObjectMapper objectMapper = JacksonUtils.getInstance();
        if (PaymentTypeEnum.T_JSAPI.getTypeCode().equals(tradeType) || PaymentTypeEnum.T_MINIAPP.getTypeCode().equals(tradeType)
                || PaymentTypeEnum.T_APP.getTypeCode().equals(tradeType) || PaymentTypeEnum.T_MICROPAY.getTypeCode().equals(tradeType)) {
            WxData wxData = new WxData();
            wxData.setSubOpenid("o8jhotzittQSetZ-N0Yj4Hz91Rqc");
            wxData.setSubAppid("wx4f4f5a5f5a5f5a5f");
            return objectMapper.writeValueAsString(wxData);
        }
        if (PaymentTypeEnum.A_JSAPI.getTypeCode().equals(tradeType) || PaymentTypeEnum.A_NATIVE.getTypeCode().equals(tradeType)
                || PaymentTypeEnum.A_MICROPAY.getTypeCode().equals(tradeType)) {
            AlipayData alipayData = new AlipayData();
            alipayData.setBuyerId("1088052871378283");
            return objectMapper.writeValueAsString(alipayData);
        }
        if (PaymentTypeEnum.U_JSAPI.getTypeCode().equals(tradeType) || PaymentTypeEnum.U_NATIVE.getTypeCode().equals(tradeType)
                || PaymentTypeEnum.U_MICROPAY.getTypeCode().equals(tradeType)) {
            UnionpayData unionpayData = new UnionpayData();
            unionpayData.setQrCode("union-542323asdas12351a51");
            unionpayData.setUserId("union4f4f5a5f5a5f5a5f");
            return objectMapper.writeValueAsString(unionpayData);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        pay();
    }
}
