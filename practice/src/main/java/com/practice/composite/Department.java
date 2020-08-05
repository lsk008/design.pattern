package com.practice.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Department extends Organization{
    public Department(String name) {
        super(name);
    }
    @Override
    protected void print(){
        System.out.print(this.getName());
    }
}
