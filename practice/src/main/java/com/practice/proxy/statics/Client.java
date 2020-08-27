package com.practice.proxy.statics;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target=new TeacherDao();
        TeacherProxy teacherProxy=new TeacherProxy(target);

        teacherProxy.teach();
    }
}
