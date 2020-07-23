package com.practice.adapter.object;

public class VoltageAdapter implements Voltage5 {
    private Voltage220 voltage220;
    @Override
    public int output5() {
        int src=voltage220.output220();
        return src/44;
    }

    public VoltageAdapter(Voltage220 voltage220){
        this.voltage220=voltage220;
    }
}
