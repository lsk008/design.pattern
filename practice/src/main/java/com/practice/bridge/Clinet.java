package com.practice.bridge;

public class Clinet {
    public static void main(String[] args) {
        Pen bigRedPen=new BigPen(new Red());
        Pen bigBluePen=new BigPen(new Blue());
        Pen smallBluePen=new SmallPen(new Blue());
        Pen smallRedPen=new BigPen(new Red());
        bigRedPen.draw();
        bigBluePen.draw();
        smallBluePen.draw();
        smallRedPen.draw();
    }
}
