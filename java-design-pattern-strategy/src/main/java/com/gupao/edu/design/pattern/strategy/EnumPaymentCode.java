package com.gupao.edu.design.pattern.strategy;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 16:36
 */
public enum  EnumPaymentCode {

    /**
     * 模拟实际的支付方式  假定只有以下两种支付方式
     */
    ALIPAY(0,"支付宝"),
    WECHAT(1,"微信");

    private Integer code;

    private String desc;

    EnumPaymentCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }


    public String getDesc() {
        return desc;
    }


}
