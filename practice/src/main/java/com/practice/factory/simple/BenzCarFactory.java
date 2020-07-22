package com.practice.factory.simple;

public class BenzCarFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new BenzCar();
    }
}
