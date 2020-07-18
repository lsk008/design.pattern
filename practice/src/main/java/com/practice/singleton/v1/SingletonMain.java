package com.practice.singleton.v1;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonInstanceV1 instance = SingletonInstanceV1.getInstance();
        SingletonInstanceV1 instance1 = SingletonInstanceV1.getInstance();
        System.out.println(instance==instance1);


    }
}
