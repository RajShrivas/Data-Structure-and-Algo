package com.stark.recursion.basic;

public class Factorial {


    public static void main(String[] args) {

        System.out.println(fact(6));
    }


    private static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}
