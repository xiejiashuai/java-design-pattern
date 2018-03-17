package com.gupao.edu.java.design.pattern.jdk;

import com.gupao.edu.java.design.pattern.staticd.LiuDeHua;
import com.gupao.edu.java.design.pattern.staticd.Singer;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 19:40
 */
public class JdkDynamicBrokerProxyTest {

    public static void main(String[] args) {

        //把生成的代理保存到当前项目中
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Singer singer= (Singer) new JdkDynamicBrokerProxy().newProxy(new LiuDeHua());

        singer.sing();

    }

}
