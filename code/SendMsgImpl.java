package com.example.demo.lecode.proxyDemo;

public class SendMsgImpl implements SendMsgService {
    @Override
    public void send(String msg) {
        System.out.println("msg is "+msg);
    }

    @Override
    public void call(String call) {
        System.out.println("call 151");
    }
}
