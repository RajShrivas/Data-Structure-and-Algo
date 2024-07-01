package com.stark.linkedlist.single;

//Linked List is basically chains of nodes where each node contains information such as data and a pointer to the next node in the chain.
public class Main {

    public static void main(String[] args) {

        LL first = new LL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);

        LL second = new LL();
        second.insertLast(4);
        second.insertLast(5);
        second.insertLast(6);


        LL ans = LL.mergeList(first, second);
        ans.printList();

        System.out.println(LL.getMiddle(ans));


    }
}
