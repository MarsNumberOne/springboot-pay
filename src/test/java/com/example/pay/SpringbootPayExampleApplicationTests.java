package com.example.pay;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.pay.util.PayUtil;
import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPayExampleApplicationTests {

    @Test
    public  void ssmain(){
        WxPayQueryRes wxPayQueryRes = new WxPayQueryRes();
        Map<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("return_code","111212122");
        wxPayQueryRes = JSON.parseObject(JSON.toJSONString(objectObjectHashMap), new TypeReference<WxPayQueryRes>() {
        });
        System.out.println(wxPayQueryRes);
    }

    @Autowired
    private WXPay wxPay;

    @Test
    public void contextLoads() throws Exception {
        Map<String, String> reqData = new HashMap<>();
        reqData.put("out_trade_no", String.valueOf(System.nanoTime()));
        reqData.put("trade_type", "NATIVE");
        reqData.put("product_id", "1");
        reqData.put("body", "商户下单");
        // 订单总金额，单位为分
        reqData.put("total_fee", "330");
        // APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。
        reqData.put("spbill_create_ip", "14.23.150.211");
        // 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。
        reqData.put("notify_url", "http://3sbqi7.natappfree.cc/wxpay/precreate/notify");
        // 自定义参数, 可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"
        reqData.put("device_info", "");
        // 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。
        reqData.put("attach", "");

        Map<String, String> responseMap = wxPay.unifiedOrder(reqData);
        String returnCode = responseMap.get("return_code");
        String resultCode = responseMap.get("result_code");
        if (WXPayConstants.SUCCESS.equals(returnCode) && WXPayConstants.SUCCESS.equals(resultCode)) {


        }
    }
}
