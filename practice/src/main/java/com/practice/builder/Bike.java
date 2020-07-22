package com.practice.builder;

import lombok.Data;

@Data
public class Bike {
    private AbstractFrame frame;
    private AbstractSeat seat;
}
