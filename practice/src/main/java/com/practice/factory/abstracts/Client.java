package com.practice.factory.abstracts;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory=new BusinessCarFactory();
        carFactory.createBenzCar();
        carFactory.createBmwCar();

        carFactory=new SportsCarFactory();
        carFactory.createBmwCar();
        carFactory.createBenzCar();
    }
}
