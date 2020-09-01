package com.practice.template;

public abstract class SoyaMilk {
    //模板方法 可以变为final,不让子类覆盖
    final void make(){
        select();
        addCondiments();
        soak();
    }

    void select(){
        System.out.println("第一步");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("第三步");
    }

}
