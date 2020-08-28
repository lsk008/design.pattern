package com.practice.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target=new TeacherDao();
        ITeacherDao proxyInstance=new ProxyFactory<>(target).getProxyInstance();
//        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();
    }
}
