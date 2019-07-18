package com.example.pay;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: Copyright 2011-2018 B5M.COM. All rights reserved
 * @author: yangren
 * @version: 1.0
 * @createdate: 2018/12/7
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2018/12/7      yangren       1.0             Why & What is modified
 */
@Data
public class WxPayQueryRes implements Serializable {
    private static final long serialVersionUID = 7982554552553529422L;

    /**
     * SUCCESS/FAIL
     * 此字段是通信标识，非交易标识，交易是否成功需要查看trade_state来判断
     */
    private String return_code;

    /**
     * 返回信息，如非空，为错误原因
     * 签名失败
     * 参数格式校验错误
     */
    private String return_msg;

    ////////////////以下字段在return_code为SUCCESS的时候有返回//////////////////
    /**
     * 微信开放平台审核通过的应用APPID
     */
    private String appid;

    /**
     * 微信支付分配的商户号
     */
    private String mch_id;

    /**
     * 随机字符串，不长于32位。推荐随机数生成算法
     */
    private String nonce_str;

    /**
     * 签名，详见签名生成算法
     */
    private String sign;

    /**
     * 业务结果
     * SUCCESS/FAIL
     */
    private String result_code;

    /**
     * 错误码
     */
    private String err_code;

    /**
     * 结果信息描述
     */
    private String err_code_des;

    /////////以下字段在return_code 和result_code都为SUCCESS的时候有返回///////////////

    /**
     * 微信支付分配的终端设备号，
     */
    private String device_info;

    /**
     * 用户在商户appid下的唯一标识
     */
    private String openid;

    /**
     * 	用户是否关注公众账号，Y-关注，N-未关注
     */
    private String is_subscribe;

    /**
     * 调用接口提交的交易类型
     */
    private String trade_type;

    /**
     * SUCCESS—支付成功

     REFUND—转入退款

     NOTPAY—未支付

     CLOSED—已关闭

     REVOKED—已撤销（刷卡支付）

     USERPAYING--用户支付中

     PAYERROR--支付失败(其他原因，如银行返回失败)
     */
    private String trade_state;

    /**
     * 银行类型，采用字符串类型的银行标识
     */
    private String bank_type;

    /**
     * 订单总金额，单位为分
     */
    private String total_fee;

    /**
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
     */
    private String fee_type;

    /**
     * 现金支付金额订单现金支付金额，详见支付金额
     */
    private String cash_fee;

    /**
     * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
     */
    private String cash_fee_type;

    /**
     * 当订单使用了免充值型优惠券后返回该参数，应结订单金额=订单金额-免充值优惠券金额。
     */
    private String settlement_total_fee;

    /**
     * “代金券或立减优惠”金额<=订单总金额，订单总金额-“代金券或立减优惠”金额=现金支付金额，详见支付金额
     */
    private String coupon_fee;

    /**
     * 	代金券或立减优惠使用数量
     */
    private String coupon_count;

    /**
     * 代金券或立减优惠ID, $n为下标，从0开始编号
     */
    private String coupon_id_$n;

    /**
     * CASH--充值代金券
     NO_CASH---非充值优惠券
     开通免充值券功能，并且订单使用了优惠券后有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0
     */
    private String coupon_type_$n;

    /**
     * 单个代金券或立减优惠支付金额, $n为下标，从0开始编号
     */
    private String coupon_fee_$n;

    /**
     * 微信支付订单号
     */
    private String transaction_id;

    /**
     * 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
     */
    private String out_trade_no;

    /**
     * 附加数据，原样返回
     */
    private String attach;

    /**
     * 订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见时间规则
     */
    private String time_end;

    /**
     * 对当前查询订单状态的描述和下一步操作的指引
     */
    private String trade_state_desc;
}
