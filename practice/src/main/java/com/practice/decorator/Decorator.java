package com.practice.decorator;

public class Decorator extends Drink{
    private Drink drink;
    public Decorator(Drink drink){
        this.drink=drink;
    }
    @Override
    public float getCost() {
        return super.getPrice()+drink.getPrice();
    }
    @Override
    public String getDes(){
        return super.getDes()+"  "+drink.getDes();
    }
}
