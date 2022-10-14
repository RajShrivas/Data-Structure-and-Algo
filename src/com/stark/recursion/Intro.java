package com.stark.recursion;

public class Intro {

    public static void main(String[] args) {
        printNum(1);
    }
    private static void printNum(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again, you can treat it as a separate call stack
        //this is the tail recursion, the last function
        printNum(n + 1);
    }
}
