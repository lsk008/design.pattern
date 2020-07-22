package com.practice.builder;

public class Client {
    public static void main(String[] args) {
        Director director=new Director(new MobieBuilder());
        director.create();
    }
}
