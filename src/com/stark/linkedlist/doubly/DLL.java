package com.stark.linkedlist.doubly;

public class DLL {

    Node head;
    Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }


    public void insertLast(int val) {

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.prev = temp;
        temp.next = node;
        node.next = null;
        tail = node;

    }

    public void print() {
        if (head == null) {
            System.out.println("list empty!!");
            return;
        }

        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }

        System.out.println("null");

        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("null");
    }

    public class Node {

        private int val;

        private Node next;

        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
