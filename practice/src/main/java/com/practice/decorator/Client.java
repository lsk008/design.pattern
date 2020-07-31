package com.practice.decorator;

public class Client {
    public static void main(String[] args) {
        Drink order=new Coffee1();
        System.out.println(order.getDes());
        System.out.println(order.getCost());



        order=new Milk1(order);
        System.out.println(order.getDes());
        System.out.println(order.getCost());


        order=new Milk2(order);
        System.out.println(order.getDes());
        System.out.println(order.getCost());

    }
}
