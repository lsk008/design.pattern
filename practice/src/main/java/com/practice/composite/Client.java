package com.practice.composite;

public class Client {
    public static void main(String[] args) {
        University university=new University("大学");
        College college1=new College("学院1");
        College college2=new College("学院2");
        Department department1=new Department("departmen1");
        Department department2=new Department("departmen2");
        Department department3=new Department("departmen3");
        college1.add(department1);
        college1.add(department2);
        college2.add(department3);
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
