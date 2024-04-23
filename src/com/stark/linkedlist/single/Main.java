package com.stark.linkedlist.single;
//Linked List is basically chains of nodes where each node contains information such as data and a pointer to the next node in the chain.
public class Main {

    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.printList();

        list.insert(100, 2);

        list.printList();


    }
}
