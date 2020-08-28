package com.practice.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory<T> {
    private T target;

    public ProxyFactory(T target) {
        this.target = target;
    }


    public T getProxyInstance() {
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理开始...");
                        Object returnValue=method.invoke(target,args);
                        return returnValue;
                    }
                });
    }
}
