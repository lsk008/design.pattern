package com.practice.decorator;

import lombok.Data;

@Data
public abstract class Drink {
    private String des;
    private float price;
    public abstract float getCost();
}
