package com.practice.singleton.v2;

import java.util.concurrent.TimeUnit;

public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {

        SingletonThread t1 = new SingletonThread();
        SingletonThread t2 = new SingletonThread();
        SingletonThread t3 = new SingletonThread();
        SingletonThread t4 = new SingletonThread();
        SingletonThread t5 = new SingletonThread();
        System.out.println("准备好了");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("开始运行");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }

}
