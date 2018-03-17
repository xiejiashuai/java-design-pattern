package com.gupao.edu.java.design.pattern.cglib;

import com.gupao.edu.java.design.pattern.staticd.LiuDeHua;
import com.gupao.edu.java.design.pattern.staticd.Singer;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Author xiejs
 * @Description
 * @Date Created in 2018/3/17 19:48
 */
public class CglibDynamicBrokerProxyTest {

    public static void main(String[] args) {

        //保存CGLIB代理生成的代理类 保存在d盘Proxy目录下
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\Proxy");

        //不能基于接口代理 必须要传递要代理的具体类的class
        Singer singer = (Singer) new CglibDynamicBrokerProxy().newProxy(LiuDeHua.class);
        singer.sing();
    }

}
