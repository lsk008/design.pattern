package com.practice.proxy.cglib;

import com.practice.builder.Teacher;

public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao=new TeacherDao();
        TeacherDao proxy=(TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxy.teach();

    }

}
