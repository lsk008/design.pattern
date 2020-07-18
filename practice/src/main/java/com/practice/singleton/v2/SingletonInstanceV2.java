package com.practice.singleton.v2;

public class SingletonInstanceV2 {
    private  volatile static SingletonInstanceV2 instance;
    private SingletonInstanceV2(){

    }
    public static SingletonInstanceV2 getInstance(){
        if(instance == null){
            synchronized (SingletonInstanceV2.class){
                if(instance == null){
                    instance=new SingletonInstanceV2();
                }
            }
        }


        return instance;
    }
}
