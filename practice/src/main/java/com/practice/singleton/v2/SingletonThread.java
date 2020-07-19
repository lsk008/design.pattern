package com.practice.singleton.v2;

public class SingletonThread extends Thread implements Runnable{
    @Override
    public void run() {
//        SingletonInstanceV2 v2=SingletonInstanceV2.getInstance();
        SingletonEnum.INSTANCE.init();
//        System.out.println(v2.hashCode());
    }
}
