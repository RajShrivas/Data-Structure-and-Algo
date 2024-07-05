package com.stark.designpattern.abstractFactory;

public class EmployeeFactory {

    public static Employee createEmployee(Class<? extends Employee> empType) {
        EmployeeAbstractFactory factory = new AbstractionImpl();
        return factory.createEmployee(empType);
    }

}
