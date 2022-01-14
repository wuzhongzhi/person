package com.example.demo.lecode.proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private  final Object obj;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }
    //想在里面干啥就干啥
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //上报
        System.out.println("上报开始");
        Object ret = method.invoke(obj,objects);
        //打印结束
        System.out.println("上报结束");
        return ret;
    }
}
