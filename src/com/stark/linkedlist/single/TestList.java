package com.stark.linkedlist.single;

public class TestList {

    Node head;
    Node tail;
    int size;

    public TestList() {
        this.size = 0;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;
    }

    public void add(int val, int index) {
        if (index == 0) {
            addFirst(val);
            return;
        }

        if (index == size) {
            addLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty!!!");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty!!!");
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
        }

        secondLast.next = null;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public class Node {

        private int val;

        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        TestList list = new TestList();
        list.addFirst(14);
        list.addFirst(16);
        list.addFirst(18);
        list.addFirst(20);
        list.addLast(28);
        list.addFirst(5);
        list.print();

        list.deleteFirst();
        list.print();

        list.deleteLast();
        list.print();

        list.add(66, 2);
        list.print();
    }
}
