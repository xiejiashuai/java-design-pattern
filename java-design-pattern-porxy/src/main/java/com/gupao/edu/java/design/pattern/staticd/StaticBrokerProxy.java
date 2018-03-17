package com.gupao.edu.java.design.pattern.staticd;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 19:30
 */
public class StaticBrokerProxy {

    //持有目标对象的引用可以是接口也可以是具体类
    private Singer target;

    public StaticBrokerProxy(Singer target) {
        this.target = target;
    }

    /**
     * 静态代理类 简单易用 缺点：如果目标类新增方法 则必须动态的改变代码 显得很臃肿
     */
    public void proxy(){
        System.out.println("我是静态代理经纪人 找歌星给你唱歌");
        target.sing();
        System.out.println("我是静态代理经纪人 你满意吗");
    }
}
