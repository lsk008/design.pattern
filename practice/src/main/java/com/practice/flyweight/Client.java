package com.practice.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory=new WebSiteFactory();
        ConcreteWebSite webSite1=factory.getWebSite("1");
        webSite1.use(new User("tom"));
        ConcreteWebSite webSite2=factory.getWebSite("2");
        webSite2.use(new User("jack"));
        ConcreteWebSite webSite3=factory.getWebSite("1");
        webSite3.use(new User("wa"));
    }
}
