package com.stark.linkedlist.doubly;

public class DMain {

    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.insertLast(111);
        list.insertFirst(100);

        list.print();
    }
}
