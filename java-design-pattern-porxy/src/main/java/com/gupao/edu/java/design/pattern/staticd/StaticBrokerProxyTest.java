package com.gupao.edu.java.design.pattern.staticd;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 19:33
 */
public class StaticBrokerProxyTest {

    public static void main(String[] args) {

//        LiuDeHua deHua=new LiuDeHua();
//
//        //代理德华唱歌
//        StaticBrokerProxy proxy=new StaticBrokerProxy(deHua);

        ZhangXueYou xueYou=new ZhangXueYou();

        //代理学友唱歌
        StaticBrokerProxy proxy=new StaticBrokerProxy(xueYou);

        proxy.proxy();
    }

}
