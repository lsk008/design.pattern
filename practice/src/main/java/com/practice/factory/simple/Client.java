package com.practice.factory.simple;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory=new BmwCarFactory();
        Car bmw=carFactory.createCar();
    }
}
