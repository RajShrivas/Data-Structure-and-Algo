package com.stark.designpattern.abstractFactory;

public class WebFactoryImpl extends EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {
        return new WebDev();
    }
}
