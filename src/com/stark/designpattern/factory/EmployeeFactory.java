package com.stark.designpattern.factory;

public class EmployeeFactory {


    public static Employee getEmployee(String empType) {

        if (empType.equalsIgnoreCase("android")) {
            return new AndroidDev();
        } else if (empType.equalsIgnoreCase("web")) {
            return new WebDev();
        } else {
            return null;
        }
    }
}
