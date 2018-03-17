package com.gupao.edu.design.pattern.strategy;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 16:47
 */
public abstract class AbstractPaymentStrategy implements IPaymentStrategy {

    /**
     * 用于定义支付的流程
     * @return
     */
    public boolean pay() {
        //获取支付网关
        String code=getGateWayCode();

        //支付前进行预处理
        preProcessBeforePay();

        //支付
        doPay();

        return false;
    }

    protected void doPay(){
        System.out.println("执行支付");
    }

    protected void preProcessBeforePay(){
        //通用的预处理
        System.out.println("通用的操作 比如更新订单状态等");
    }

    abstract String getGateWayCode();
}
