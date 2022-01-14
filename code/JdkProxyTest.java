package com.example.demo.lecode.proxyDemo;

import java.lang.reflect.Proxy;

public class JdkProxyTest {
    public static Object getProxy(Object object){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),new MyInvocationHandler(object));
    }
    public static void main(String[] args) {
        SendMsgService sendMsgService = (SendMsgService) getProxy(new SendMsgImpl());
        sendMsgService.send("fdff");
    }
}
