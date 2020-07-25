package com.practice.bridge;

public class BigPen extends Pen{
    public BigPen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("big pen draw");
    }
}
