package com.practice.proxy.statics;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("teach something..");
    }
}
