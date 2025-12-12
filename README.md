# Dougong Lightning SDK（Java）项目说明

## 概述
Dougong Lightning SDK 以 V4 插件的形式提供极简聚合支付能力，遵循“化繁为简、必参极简 + 可选灵活扩展”的设计风格，通过统一的调用入口与对象化入参模型降低集成成本。

## 主要特性
- 统一入口：通过 `Factory` 创建客户端，所有能力从一个入口发起。
- 必参极简：主交易字段最小化，低频参数走扩展注入。
- 可插拔扩展：`optional(key, value)` 注入场景参数，保持模型稳定。
- 统一管道：入参归一、扩展合并、序列化、路由与调用一体化。
- 多场景覆盖：下单、查询、关单、退款、退款查询。

## 包结构简述
- `factory`：统一入口与客户端创建（`Factory`）。
- `biz.client`：业务客户端与链式扩展（`CommonPayClient`、`BasePayClient`）。
- `biz.net`：网关请求、签名与路由（`BasePayRequest`）。
- `models`：对象化入参/响应与领域对象（如 `TradePaymentCreateRequest`、分账对象）。
- `utils`：基础工具与配置（`BasePay`、`DateTools`、`SequenceTools` 等）。

## 安装与引入
在上层业务模块的 `pom.xml` 中引入：
```xml
<dependency>
  <groupId>com.huifu.dg.lightning.sdk</groupId>
  <artifactId>dg-lightning-sdk</artifactId>
  <version>1.0.3</version>
</dependency>
```

## 场景快速冒烟
- 目标：零门槛验证“统一入口 + 极简扩展”是否接通。
- 示例目录：查看 dougong-java-sdk项目的bspay-java-sdk-sample 项目
- 操作步骤：
    - 在示例目录选择一个交易类型示例类（如 JSAPI/正扫/付款码）。
    - 设置主交易字段：`req_date`、`req_seq_id`、`huifu_id`、`goods_desc`、`trans_amt`、`trade_type`。
    - 注入通道扩展：将场景参数对象序列化为 JSON，使用 `optional("method_expand", json)` 注入；
    - 叠加收单能力：如需贴息/增值等，序列化为 JSON，使用 `optional("tx_metadata", json)` 注入。
    - 运行示例类的 `main` 或测试方法，观察返回的交易号/二维码/支付参数等核心结果。


## 快速开始
```java
// 1. 初始化商户配置（建议从配置中心加载 MerConfig 后调用 BasePay.initWithMerConfig）
BasePay.initWithMerConfig(merConfig);

// 2. 组装必填入参（以聚合下单为例）
TradePaymentCreateRequest req = new TradePaymentCreateRequest();
req.setReqDate(DateTools.getCurrentDateYYYYMMDD());
req.setReqSeqId(SequenceTools.getReqSeqId32());
req.setHuifuId("6666xxxxxxxxxxx");
req.setGoodsDesc("商品描述");
req.setTransAmt("0.01");
req.setTradeType("A_JSAPI");

// 3. 通过工厂获取客户端并发起调用
Map<String, Object> resp = Factory.Payment.Common()
        .optional("notify_url", "https://your.notify/url")
        .create(req);
```

## 可选参数扩展
- 使用链式的 `optional(key, value)` 在客户端注入低频参数，这些参数将与请求体合并并覆盖同名字段。

## 下单统一入口与扩展模型
- 单一入口：所有支付下单统一通过 `CommonPayClient#create` 发起
- 交易抽象：用 `trade_type` 标识具体支付场景；用 `method_expand` 承载该场景的专有参数，二者组合即为“交易对象”的扩展模型。
- 收敛策略：新增或变更任意交易场景时，仅需定义场景参数对象 → 序列化为 JSON → 注入 `method_expand`，无需新增接口或客户端方法。
- 推荐用法：保持必参极简，扩展参数一律通过 `optional("method_expand", json)` 注入；若无扩展，传 `"{}"` 即可。
- 调用示例：
  ```java
  req.setTradeType("T_JSAPI");
  String json = JSON.toJSONString(wxData);
  Map<String, Object> resp = Factory.Payment.Common()
      .optional("method_expand", json)
      .create(req);
  ```

## 交易设计理念
- 意向订单（主交易字段）：用统一的主字段表达订单意向与基础要素，如日期、流水号、商户、金额、商品等，保持稳定不随渠道变化。
- 通道信息（trade_type + method_expand）：以 `trade_type` 选择支付通道/场景，以 `method_expand` 承载该通道的专有参数，二者组合定义“如何支付”。新增渠道能力只需新增专有参数对象并通过 `method_expand` 注入，无需改动统一入口。
- 收单附加能力（tx_metadata）：用于承载收单侧扩展能力，如贴息、分期、优惠分账、增值等，以 JSON 字符串注入即可。
- 三层划分：将一次交易抽象为“意向订单（主字段）+ 通道（trade_type+method_expand）+ 收单附加能力（tx_metadata）”。该划分确保主交易模型稳定、通道能力可插拔、收单扩展可累加，统一入口下自然演进。
## 统一请求管道（简述）
- 入参归一：将请求对象规范化为键值对。
- 扩展合并：合并扩展参数，客户端注入覆盖同名字段。
- 特殊序列化：对象型特殊字段统一序列化为 JSON 字符串。
- 路径解析与调用：将功能码解析为网关路径，完成 HTTP 调用并返回统一结果。

## 常用接口示例
- 支付下单：`CommonPayClient#create`（`TradePaymentCreateRequest`）
- 支付查询：`CommonPayClient#query`
- 关单：`CommonPayClient#close`
- 退款：`CommonPayClient#refund`
- 退款查询：`CommonPayClient#refundQuery`

## 开箱即用与场景示例
- 项目定位：本包为 V4 极简插件，示例与运行入口位于主 SDK 项目。
- 示例目录：`bspay-java-sdk-parent/bspay-java-sdk-sample/src/main/java/com/huifu/bspay/sdk/demo/v4`
- 使用方式：在主 SDK 示例目录中选择对应交易类型的示例类，按需修改基础入参与扩展参数（`trade_type + method_expand` / `tx_metadata`），直接运行。
- 配置说明：主 SDK 通过配置中心加载环境与密钥信息；如运行异常，请在主 SDK 项目中调整环境与商户配置。

## 配置说明
- 通过 `BasePay.initWithMerConfig(MerConfig)` 或 `BasePay.initWithMerConfigs(Map<String, MerConfig>)` 完成多商户配置加载（`dg-lightning-sdk/src/main/java/com/huifu/dg/lightning/utils/BasePay.java:57-71`）。
- 调用时使用默认商户配置，或在请求方法中指定 `merchantKey` 选择商户配置（`BasePayRequest` 的对应重载）。
- `BasePay.prodMode` 控制目标环境域名（生产/联测/内部），统一封装于 `BasePayRequest` 调用路径解析。

## 异常与错误




## 许可与版本
- 版本：`1.0.3`
- 许可证：Apache-2.0（详见根 POM）
