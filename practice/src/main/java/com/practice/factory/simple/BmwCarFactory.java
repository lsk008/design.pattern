package com.practice.factory.simple;

public class BmwCarFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new BmwCar();
    }
}
