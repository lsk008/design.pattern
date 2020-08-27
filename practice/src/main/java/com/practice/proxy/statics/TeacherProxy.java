package com.practice.proxy.statics;

public class TeacherProxy implements ITeacherDao{
    private ITeacherDao target;
    public TeacherProxy(ITeacherDao target){
        this.target=target;
    }
    @Override
    public void teach() {
        System.out.println("开始加强");
        target.teach();
        System.out.println("结束加强");
    }
}
