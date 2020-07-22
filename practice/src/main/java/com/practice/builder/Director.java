package com.practice.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }

    public Bike create(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
