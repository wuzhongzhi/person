package com.example.demo.lecode.proxyDemo;

import org.springframework.cglib.proxy.Enhancer;


public class CglibProxyTest {
    public static Object getProxy(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }
    public static Object getProxy2(Object obj){
        return Enhancer.create(obj.getClass(),new MyMethodInterceptor2(obj));
    }
    public static void main(String[] args) {
        //方式一优雅型的
        Send send =  (Send) getProxy(Send.class);
        send.SendMsg("test");
        //方式二
        Send send1= (Send)getProxy2(new Send());
        send1.SendMsg("test2");
    }
}
