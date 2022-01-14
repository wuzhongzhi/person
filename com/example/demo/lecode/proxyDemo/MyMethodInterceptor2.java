package com.example.demo.lecode.proxyDemo;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor2 implements MethodInterceptor {
    private final Object object;

    public MyMethodInterceptor2(Object object) {
        this.object = object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理前上报");
        Object ret = method.invoke(object,objects);
        System.out.println("cglib 代理后上报");
        return  ret;
    }
}
