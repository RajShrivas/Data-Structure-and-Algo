package com.stark.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();


        System.out.println(inst1.hashCode());
        System.out.println(inst2.hashCode());


        //How to break Singleton Patter with Reflection API
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton = declaredConstructor.newInstance();
        System.out.println(singleton.hashCode());


        //How to break Singleton Patter with Serialization & Deserialization
        Singleton s3 = Singleton.getInstance();
        System.out.println(s3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s3);

        System.out.println("Serialization done.......");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));

        Singleton o = (Singleton) ois.readObject();

        System.out.println(o.hashCode());

    }
}
