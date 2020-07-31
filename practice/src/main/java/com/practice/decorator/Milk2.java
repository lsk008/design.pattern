package com.practice.decorator;

public class Milk2 extends Decorator{
    public Milk2(Drink drink) {
        super(drink);
        this.setPrice(3.4f);
        this.setDes("milk2");
    }
}
