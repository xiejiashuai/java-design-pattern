package com.gupao.edu.design.pattern.strategy;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 16:31
 */
public interface IPaymentStrategy {

    boolean pay();

    Integer getStrategyCode();

}
