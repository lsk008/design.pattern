package com.practice.factory.simple;

import lombok.Data;

@Data
public class BmwCar extends Car{
    public BmwCar(){
        System.out.println("init bmwCar");
    }
}
