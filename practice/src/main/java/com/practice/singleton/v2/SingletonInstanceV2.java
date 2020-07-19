package com.practice.singleton.v2;

public class SingletonInstanceV2 {
    private SingletonInstanceV2(){

    }
    private static class SingletonInstance{
        private static final SingletonInstanceV2 instance=new SingletonInstanceV2();
    }

    public SingletonInstanceV2 getInstance(){
        return SingletonInstance.instance;
    }
}
