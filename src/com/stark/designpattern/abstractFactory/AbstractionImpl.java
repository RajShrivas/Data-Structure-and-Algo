package com.stark.designpattern.abstractFactory;

public class AbstractionImpl extends EmployeeAbstractFactory {


    @Override
    public Employee createEmployee(Class<? extends Employee> empType) {
        try {
            return empType.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
