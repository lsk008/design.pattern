package com.practice.bridge;

public abstract class Pen {
    protected Color color;
    public void draw(){
        color.paint();
    };
    public Pen(Color color){
        this.color=color;
    }
}
