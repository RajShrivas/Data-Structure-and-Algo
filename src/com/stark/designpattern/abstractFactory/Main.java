package com.stark.designpattern.abstractFactory;

public class Main {

    public static void main(String[] args) {

        Employee employee = EmployeeFactory.createEmployee(new WebFactoryImpl());
        Employee employee2 = EmployeeFactory.createEmployee(new AndroidFactoryImpl());

        System.out.println(employee.name());
        System.out.println(employee2.name());
    }
}
