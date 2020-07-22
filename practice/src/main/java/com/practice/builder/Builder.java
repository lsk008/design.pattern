package com.practice.builder;

public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract Bike createBike();
}
