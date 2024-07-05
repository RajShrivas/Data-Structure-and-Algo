package com.stark.designpattern.abstractFactory;

public class EmployeeFactory {


    public static Employee createEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
