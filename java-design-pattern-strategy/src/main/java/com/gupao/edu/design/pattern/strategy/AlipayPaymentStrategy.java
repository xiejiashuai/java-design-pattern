package com.gupao.edu.design.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 16:32
 */
@Component
public class AlipayPaymentStrategy extends AbstractPaymentStrategy{


    public Integer getStrategyCode() {
        return EnumPaymentCode.ALIPAY.getCode();
    }

    @Override
    String getGateWayCode() {
        return "aliPay";
    }

    @Override
    protected void preProcessBeforePay() {
        System.out.println("获取支付宝账户");
        super.preProcessBeforePay();
    }

}
