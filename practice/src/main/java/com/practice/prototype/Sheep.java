package com.practice.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheep{
    private String name;
    private int age;
    private String color;
    @Override
    public Sheep clone(){
        Sheep sheep=new Sheep(this.name,this.age,this.color);
        return sheep;
    }
}
