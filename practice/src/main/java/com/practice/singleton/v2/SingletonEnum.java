package com.practice.singleton.v2;

public enum SingletonEnum {
    INSTANCE;
    public void init(){
        System.out.println("init success");
    }
}
