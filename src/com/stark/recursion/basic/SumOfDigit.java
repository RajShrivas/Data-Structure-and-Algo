package com.stark.recursion.basic;
//Ex-> n=345   ans= 12 (3+4+5)
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
