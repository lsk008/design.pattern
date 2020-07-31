package com.practice.decorator;

public class Milk1 extends Decorator{
    public Milk1(Drink drink) {
        super(drink);
        this.setPrice(2.3f);
        this.setDes("milk");
    }
}
