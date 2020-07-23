package com.practice.adapter.clazz;

public class VoltageAdapter extends Voltage220 implements Voltage5{
    @Override
    public int output5() {
        int src=super.output220();
        return src/44;
    }
}
