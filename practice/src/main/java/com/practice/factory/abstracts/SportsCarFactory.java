package com.practice.factory.abstracts;

public class SportsCarFactory extends CarFactory{
    @Override
    public BenzCar createBenzCar() {
        return new SportBenzCar();
    }

    @Override
    public BmwCar createBmwCar() {
        return new SportBmwCar();
    }
}
