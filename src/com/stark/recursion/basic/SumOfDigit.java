package com.stark.recursion.basic;

public class SumOfDigit {


    public static void main(String[] args) {
        System.out.println(sod(345));
    }

    private static int sod(int n) {
        if (n == 0) {
            return 0;
        }
        return sod(n / 10) + (n % 10);
    }
}
