package com.practice.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class University extends Organization{
    private List<Organization> colleges=new ArrayList<>();
    public University(String name) {
        super(name);
    }
    @Override
    protected void add(Organization organization){
       colleges.add(organization);
    }
    @Override
    protected void remove(Organization organization){
        colleges.remove(organization);
    }
    @Override
    protected void print(){
        System.out.println(this.getName());
        this.colleges.stream()
                .forEach(t->t.print());
    }
}
