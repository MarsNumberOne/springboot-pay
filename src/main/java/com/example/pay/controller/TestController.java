package com.example.pay.controller;

import com.alipay.api.AlipayApiException;
import com.example.pay.test.AliPayNotifyReq;
import com.example.pay.test.TestIp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class TestController {

	public static void main(String[] args) {
		Double ad = 21.975;
        String s = formatDouble4(ad);
        System.out.println(s);
    }

	public static String formatDouble4(double d) {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(d);
	}
	@RequestMapping(value = "/notify_url",method = RequestMethod.POST)
    public String notify_url(HttpServletRequest request, HttpServletResponse response) throws IOException, AlipayApiException {
		PrintWriter pw = response.getWriter();
		pw.println("success");
		return null;
	}
 
	@RequestMapping("/return_url")
	public void return_url(HttpServletRequest request, HttpServletResponse response) {
        String ip = request.getRemoteAddr();
        try {
            String address = TestIp.getAddresses("ip="+ip, "utf-8");
            System.out.println(address);
        } catch (IOException e) {

        }
    }

	@RequestMapping("/webPay")
	public String webPay() {
		return "/gotoPagePay";
	}
}
