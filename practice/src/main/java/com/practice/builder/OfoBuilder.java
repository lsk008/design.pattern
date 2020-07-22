package com.practice.builder;

public class OfoBuilder extends Builder{
    private Bike ofoBike=new Bike();
    @Override
    void buildFrame() {
        ofoBike.setFrame(new OfoFrame());
    }

    @Override
    void buildSeat() {
        ofoBike.setSeat(new OfoSeat());
    }

    @Override
    Bike createBike() {
        return ofoBike;
    }
}
