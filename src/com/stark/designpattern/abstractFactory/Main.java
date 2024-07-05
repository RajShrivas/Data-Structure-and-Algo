package com.stark.designpattern.abstractFactory;

public class Main {

    public static void main(String[] args) {


        Employee employee = EmployeeFactory.createEmployee(WebDev.class);
        Employee employee2 = EmployeeFactory.createEmployee(AndroidDev.class);
        System.out.println(employee.name());
        System.out.println(employee2.name());
    }
}
