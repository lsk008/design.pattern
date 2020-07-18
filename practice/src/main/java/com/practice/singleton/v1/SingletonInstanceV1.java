package com.practice.singleton.v1;

public class SingletonInstanceV1 {
    private final static SingletonInstanceV1 instance=new SingletonInstanceV1();
    private SingletonInstanceV1(){

    }
    public static SingletonInstanceV1 getInstance(){
        return instance;
    }
}
