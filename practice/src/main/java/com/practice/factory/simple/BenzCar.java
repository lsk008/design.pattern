package com.practice.factory.simple;

import lombok.Data;

@Data
public class BenzCar extends Car{
    public BenzCar(){
        System.out.println("init BenzCar");
    }
}
