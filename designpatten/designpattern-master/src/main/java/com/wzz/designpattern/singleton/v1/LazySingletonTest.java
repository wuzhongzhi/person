package com.wzz.designpattern.singleton.v1;

public class LazySingletonTest {
    public static void main(String[] args) {


        Thread thread1=new Thread( () -> {
            LazySingleton instance=LazySingleton.getInstance();
            System.out.println( instance );

        } );


        Thread thread2=new Thread( () -> {
            LazySingleton instance=LazySingleton.getInstance();
            System.out.println( instance );

        } );

        thread1.start();
        thread2.start();


    }
}
class LazySingleton{

    private volatile static LazySingleton instance;
    private LazySingleton(){

    }
    public  static LazySingleton getInstance() {

        if (instance==null){

            synchronized (LazySingleton.class){
                if (instance==null){
                  // JIT， CPU
                    instance=new LazySingleton();
                    //  1.分配空间
                    //  2.初始化
                    //  3.赋值

                }

            }

        }
        return instance;
    }
}