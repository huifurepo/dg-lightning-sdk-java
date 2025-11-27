package com.huifu.dg.lightning.biz.payment.create;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.dg.lightning.biz.OppsMerchantConfigDemo;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.WxData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 * @author bo.dong
 * @date 2025/10/13 10:55
 * @description 微信小程序支付demo
 */
public class T_MINIAPPTest {

    public static void main(String[] args) throws Exception {
        T_MINIAPP_PROD();
    }


    public static void T_MINIAPP_PROD() throws Exception{
        BasePay.initWithMerConfig(OppsMerchantConfigDemo.getMerchantConfig(BasePay.MODE_PROD));


        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("hibs自动化-通用版验证");// 商品描述
        request.setTransAmt("0.04"); // 交易金额
        request.setRemark("JSPAY:ID:102");//交易备注
        request.setNotifyUrl("https:/www.demoSite.com/api/public/hf/smstorecallback");

        request.setTradeType("T_MINIAPP"); // 交易类型 - 微信小程序
        //以下为微信小程序需要的参数
        String wxDataString="";
        WxData wxData = new WxData();
        wxData.setSubOpenid("o8jhotzittQSetZ-N0Yj4Hz91Rqc");
        wxData.setSubAppid("wxdfe9a5d141f96685");
        //微信相关参数可参考官方文档 https://pay.weixin.qq.com/doc/v2/merchant/4011935214
        //复杂{"body":"香土鸡餐馆：线下支付","detail":{"cost_price":"1.0","goods_detail":[{"goods_id":"1967776038541551111","goods_name":"香土鸡餐馆：线下支付","price":"1.0","quantity":1}],"receipt_id":"1970743410445500000"},"scene_info":{"store_info":{"id":"1967776038541550000","name":"香土鸡餐馆：线下支付"}},"sub_appid":"wx969f2ef2df1111","sub_openid":"oqVX87O2I2U3rT-BBBBBBBB-YsU"}
        wxDataString = JSON.toJSONString(wxData);

        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", wxDataString).create(request);
        System.out.println("T_MINIAPP返回数据:" +  JSON.toJSONString(response));
    }

}

