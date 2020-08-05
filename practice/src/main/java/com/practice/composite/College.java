package com.practice.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class College extends Organization{
    private List<Organization> department=new ArrayList<>();
    public College(String name) {
        super(name);
    }
    @Override
    protected void add(Organization organization){
        department.add(organization);
    }
    @Override
    protected void remove(Organization organization){
        department.remove(organization);
    }
    @Override
    protected void print(){
        System.out.println(this.getName());
        this.department.stream()
                .forEach(t->t.print());
    }
}
