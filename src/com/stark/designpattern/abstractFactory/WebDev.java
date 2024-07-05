package com.stark.designpattern.abstractFactory;

public class WebDev implements Employee {

    @Override
    public String name() {
        return "I am WebDev";
    }

    @Override
    public int salary() {
        return 1900000;
    }
}
