package com.example.pay.configuration;

import com.github.wxpay.sdk.WXPayConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 微信支付的参数配置
 *
 * @author mengday zhang
 */
@Data
@Slf4j
@ConfigurationProperties(prefix = "pay.wxpay")
public class MyWXPayConfig implements WXPayConfig{

    /** 公众账号ID */
    private String appID;

    /** 商户号 */
    private String mchID;

    /** API 密钥 */
    private String key;

    /** API 沙箱环境密钥 */
    private String sandboxKey;

    /** 退款异步通知地址 */
    private String notifyUrl;

    private Boolean useSandbox;

    /** HTTP(S) 连接超时时间，单位毫秒 */
    private int httpConnectTimeoutMs = 8000;

    /** HTTP(S) 读数据超时时间，单位毫秒 */
    private int httpReadTimeoutMs = 10000;

    @Override
    public String getKey(){
        if (useSandbox) {
            return sandboxKey;
        }

        return key;
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

}
