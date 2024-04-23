package com.stark.linkedlist.circular;

public class CMain {


    public static void main(String[] args) {

        CL list = new CL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.print();
        list.delete(3);
        list.print();
    }
}
