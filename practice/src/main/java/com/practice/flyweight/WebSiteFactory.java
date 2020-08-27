package com.practice.flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool=new HashMap<>();



    public ConcreteWebSite getWebSite(String type){
        if(pool.containsKey(type)){
            return pool.get(type);
        }
        ConcreteWebSite concreteWebSite=new ConcreteWebSite(type);
        pool.put(type,concreteWebSite);
        return concreteWebSite;
    }

}
