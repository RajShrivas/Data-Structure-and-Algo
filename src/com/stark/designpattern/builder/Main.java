package com.stark.designpattern.builder;

public class Main {


    public static void main(String[] args) {

        User user = User.UserBuilder.builder()
                .setName("Raj")
                .setEmail("raj@gmail.com")
                .setDesignation("Developer")
                .build();


        System.out.println(user);
    }
}
