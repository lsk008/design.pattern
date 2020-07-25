package com.practice.bridge;

public class SmallPen extends Pen{
    public SmallPen(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("small pen draw");
    }
}
