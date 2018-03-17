package com.gupao.edu.java.design.pattern.jdk;

import com.gupao.edu.java.design.pattern.staticd.Singer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 19:36
 */
public class JdkDynamicBrokerProxy implements InvocationHandler{

    //持有目标对象的引用
    private Singer target;

    public Object newProxy(Singer target){

        //保存目标对象的引用
        this.target=target;

        //必须和目标对象使用同一个类加载器 基于接口进行代理无法对类进项代理
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是动态代理经纪人 找歌星给你唱歌");
        Object invoke = method.invoke(target, args);
        System.out.println("我是动态代理经纪人 你满意吗");

        return invoke;
    }
}
