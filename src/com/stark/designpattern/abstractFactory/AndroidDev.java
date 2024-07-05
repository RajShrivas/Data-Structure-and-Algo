package com.stark.designpattern.abstractFactory;

public class AndroidDev implements Employee {

    @Override
    public String name() {
        return "I am Android Developer";
    }

    @Override
    public int salary() {
        return 2000000;
    }
}
