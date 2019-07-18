package com.example.pay.test;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: Copyright 2011-2018 B5M.COM. All rights reserved
 * @author: yangren
 * @version: 1.0
 * @createdate: 2018/10/17
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2018/10/17      yangren       1.0             Why & What is modified
 */
@Data
public class AliPayNotifyReq implements Serializable {

    private static final long serialVersionUID = -9174216303311915606L;

    /**
     * 通知时间 通知的发送时间。格式为yyyy-MM-dd HH:mm:ss
     */
    private Date notify_time;

    /**
     * 通知类型
     */
    private String notify_type;

    /**
     * 通知校验ID
     */
    private String notify_id;

    /**
     * 编码格式 编码格式，如utf-8、gbk、gb2312等
     */
    private String charset;

    /**
     * 接口版本
     */
    private String version;

    /**
     * 签名类型
     */
    private String sign_type;

    /**
     * 签名
     */
    private String sign;

    /**
     * 授权方的app_id
     */
    private String auth_app_id;

    /**
     * 支付宝交易号
     */
    private String trade_no;

    /**
     * 开发者的app_id
     */
    private String app_id;

    /**
     * 商户订单号
     */
    private String out_trade_no;

    /**
     * 商户业务号
     */
    private String out_biz_no;

    /**
     * 买家支付宝用户号
     */
    private String buyer_id;

    /**
     * 卖家支付宝用户号
     */
    private String seller_id;

    /**
     * 交易状态
     */
    private String trade_status;

    /**
     * 订单金额
     */
    private Integer total_amount;

    /**
     * 实收金额
     */
    private Integer receipt_amount;

    /**
     * 开票金额
     */
    private Integer invoice_amount;

    /**
     * 付款金额
     */
    private Integer buyer_pay_amount;

    /**
     * 集分宝金额
     */
    private Integer point_amount;

    /**
     * 总退款金额
     */
    private Integer refund_fee;

    /**
     * 订单标题
     */
    private String subject;

    /**
     * 商品描述
     */
    private String body;

    /**
     * 交易创建时间
     */
    private Date gmt_create;

    /**
     * 交易付款时间
     */
    private Date gmt_payment;

    /**
     * 交易退款时间
     */
    private Date gmt_refund;

    /**
     * 交易结束时间
     */
    private Date gmt_close;

    /**
     * 支付金额信息
     */
    private String fund_bill_list;

    /**
     * 优惠券信息
     */
    private String voucher_detail_list;

    /**
     * 回传参数
     */
    private String passback_params;
}
