package com.practice.adapter.clazz;

public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charge(new VoltageAdapter());
    }
}
