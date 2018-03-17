package com.gupao.edu.design.pattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 16:32
 */
@Component
public class WechatPaymentStrategy extends AbstractPaymentStrategy{

    public boolean pay() {

        System.out.println("weChat starting ...");
        return false;
    }

    String getGateWayCode() {
        return "weChat";
    }

    public Integer getStrategyCode() {
        return EnumPaymentCode.WECHAT.getCode();
    }

    @Override
    protected void preProcessBeforePay() {
        //获取微信账户
        System.out.println("获取微信账户");
        super.preProcessBeforePay();
    }
}
