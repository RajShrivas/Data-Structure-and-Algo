package com.stark.designpattern.factory;

import java.lang.reflect.InvocationTargetException;

public class EmployeeFactory {

    //By passing a string value
    public static Employee getEmployee(String empType) {

        if (empType.equalsIgnoreCase("android")) {
            return new AndroidDev();
        } else if (empType.equalsIgnoreCase("web")) {
            return new WebDev();
        } else {
            return null;
        }
    }


    //Bypassing a class type
    public static Employee getEmployee(Class<? extends Employee> empType) {
        try {
            return empType.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            return null;
        }
    }
}
