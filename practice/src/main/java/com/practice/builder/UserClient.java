package com.practice.builder;

public class UserClient {
    public static void main(String[] args) {
        User user=new User.Builder()
                .name("tom")
                .age(12)
                .build();

        System.out.println(user.toString());



        Teacher teacher= Teacher.builder()
                .age(11)
                .name("12")
                .build();

        Teacher teacher1=new Teacher("d",11);

        System.out.println(teacher);

    }
}
