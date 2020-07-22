package com.practice.builder;

import lombok.ToString;

@ToString
public class User {
    private String name;
    private int age;

    private User(){

    }

    private User(Builder builder){
        name=builder.name;
        age=builder.age;
    }

    public static class Builder{
        private String name;
        private int age;
        public Builder(){}
        public Builder name(String val){
            name=val;
            return this;
        }
        public Builder age(int val){
            age=val;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
