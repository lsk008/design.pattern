package com.practice.builder;

public class MobieBuilder extends Builder{
    private Bike mobieBike=new Bike();
    @Override
    void buildFrame() {
        mobieBike.setFrame(new MobieFrame());
    }

    @Override
    void buildSeat() {
        mobieBike.setSeat(new MobieSeat());
    }

    @Override
    Bike createBike() {
        return mobieBike;
    }
}
