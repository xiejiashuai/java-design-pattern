package com.gupao.edu.design.pattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 16:38
 */
@Component
public class PaymentStrategyRegistry {

    private static final Map<Integer,IPaymentStrategy> map=new HashMap<Integer, IPaymentStrategy>();

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void init(){

        Map<String, IPaymentStrategy> strategyMap = context.getBeansOfType(IPaymentStrategy.class);

        for (Map.Entry<String, IPaymentStrategy> entry : strategyMap.entrySet()) {

            map.put(entry.getValue().getStrategyCode(),entry.getValue());

        }

    }

    public IPaymentStrategy getStrategy(Integer code){

        IPaymentStrategy iPaymentStrategy = map.get(code);

        Assert.notNull(iPaymentStrategy,"failed to get iPaymentStrategy");

        return iPaymentStrategy;

    }

}
