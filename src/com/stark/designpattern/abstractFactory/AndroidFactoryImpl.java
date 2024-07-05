package com.stark.designpattern.abstractFactory;

public class AndroidFactoryImpl extends EmployeeAbstractFactory{


    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
}
