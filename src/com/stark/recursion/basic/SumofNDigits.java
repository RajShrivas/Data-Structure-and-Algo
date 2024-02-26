package com.stark.recursion.basic;

public class SumofNDigits {


    public static void main(String[] args) {

        System.out.println(sumOfDigits(4));
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumOfDigits(n - 1);
    }
}
