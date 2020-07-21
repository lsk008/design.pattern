package com.practice.prototype;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws Exception{
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Sheep sheep1=context.getBean(Sheep.class);
        Sheep sheep2=context.getBean(Sheep.class);
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());
        System.out.println(sheep2==sheep1);
        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext("com.practice");
        Wolf wolf=context1.getBean(Wolf.class);
        System.out.println(wolf);


    }
}
