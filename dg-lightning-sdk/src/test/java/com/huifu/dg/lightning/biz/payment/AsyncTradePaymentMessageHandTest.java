package com.huifu.dg.lightning.biz.payment;

import java.util.UUID;

/**
 * Desc:异步消息处理demo
 * 接收异步消息需要部署http服务
 * demo使用spring mvc开发http服务端
 * 请引入spring-web 依赖
 **/
//@RestController
public class AsyncTradePaymentMessageHandTest {

    /**
     * 接收异步消息的服务
     * messageBody：消息体
     */
    //@RequestMapping("/asyncMessageHand")
    public String print(//@RequestBody
                        String messageBody) {


        // 业务处理


        return "RECV_ORD_ID_" + UUID.randomUUID();
    }

}
