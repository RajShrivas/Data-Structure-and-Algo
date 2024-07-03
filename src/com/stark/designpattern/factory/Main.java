package com.stark.designpattern.factory;

public class Main {


    public static void main(String[] args) {

        Employee android = EmployeeFactory.getEmployee("android");
        assert android != null;
        System.out.println(android.salary());

        Employee web = EmployeeFactory.getEmployee(WebDev.class);
        assert web != null;
        System.out.println(web.salary());

    }
}
