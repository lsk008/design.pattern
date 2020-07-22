package com.practice.factory.abstracts;

public class BusinessCarFactory extends CarFactory{
    @Override
    public BenzCar createBenzCar() {
        return new BusinessBenzCar();
    }

    @Override
    public BmwCar createBmwCar() {
        return new BmwCar();
    }
}
