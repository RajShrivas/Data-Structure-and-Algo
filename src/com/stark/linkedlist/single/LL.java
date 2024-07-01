package com.stark.linkedlist.single;

import java.util.ArrayList;

public class LL {

    private Node head;

    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = node;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
    }


    public void insertRecursion(int val, int index) {

        head = insertRecursion(val, index, head);
    }

    public Node insertRecursion(int val, int index, Node node) {

        if (index == 0) {
            System.out.println(node.val);
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        System.out.println("before :" + node.val);
        node.next = insertRecursion(val, index - 1, node.next);
        System.out.println("final :" + node.val);
        return node;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!!!!!!");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!!!!!!");
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void printList() {

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " -->");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    private static class Node {

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

    //questions

    public void duplicates() {
        Node temp = head;

        while (temp.next != null) {
            System.out.println(temp.val + " & " + temp.next.val);
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        tail = temp;
        tail.next = null;
    }


    //merge
    public static LL mergeList(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while (f != null && s != null) {

            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }


    //find middle node
    public static int getMiddle(LL list) {

        Node temp = list.head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (temp.next != null) {
            arrayList.add(temp.val);
            temp = temp.next;
        }

        int mid = arrayList.size() / 2;
        return arrayList.get(mid);
    }
}
