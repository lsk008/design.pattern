package com.practice.decorator;

public class Coffee extends Drink{
    @Override
    public float getCost() {
        return super.getPrice();
    }
}
