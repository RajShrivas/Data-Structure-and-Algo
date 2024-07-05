package com.stark.designpattern.abstractFactory;

abstract public class EmployeeAbstractFactory {

    public abstract Employee createEmployee(Class<? extends Employee> empType);

}
