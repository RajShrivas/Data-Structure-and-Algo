package com.stark.designpattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance;

    //private constructor
    private Singleton() {

    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
