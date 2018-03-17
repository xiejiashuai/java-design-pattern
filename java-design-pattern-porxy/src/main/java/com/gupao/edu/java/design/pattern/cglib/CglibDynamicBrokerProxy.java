package com.gupao.edu.java.design.pattern.cglib;

import com.gupao.edu.java.design.pattern.staticd.Singer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 19:44
 */
public class CglibDynamicBrokerProxy implements MethodInterceptor{

    public Object newProxy(Class<?> clazz){

        //保存目标对象的引用
        Enhancer enhancer =new Enhancer();
        //设置要代理的类 基于继承代理 代理具体类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);

        return enhancer.create();

    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("我是CGLIB动态代理经纪人 找歌星给你唱歌");
        //执行目标类的方法
        Object o = proxy.invokeSuper(obj, args);
        System.out.println("我是CGLIB动态代理经纪人 你满意吗");
        return o;
    }
}
