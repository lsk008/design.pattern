package com.practice.adapter.clazz;

public class Phone {
    public void charge(Voltage5 voltage5){
        int voltage=voltage5.output5();
        if(voltage>5){
            throw new RuntimeException();
        }
        System.out.println("charging...");
    }
}
