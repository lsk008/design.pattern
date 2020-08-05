package com.practice.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public abstract class Organization {
    private String name;
    protected void add(Organization organization){
        throw new UnsupportedOperationException();
    }
    protected void remove(Organization organization){
        throw new UnsupportedOperationException();
    }
    protected void print(){
        System.out.println(name);
    }
    public Organization(String name){
        this.name=name;
    }
}
