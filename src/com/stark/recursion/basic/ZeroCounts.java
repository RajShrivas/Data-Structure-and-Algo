package com.stark.recursion.basic;

public class ZeroCounts {


    public static void main(String[] args) {
        int ans = count(306790);
        System.out.println(ans);
    }

    private static int count(int n) {
        return zeros(n, 0);
    }

    //Special pattern, how to pass a value to above call
    private static int zeros(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return zeros(n / 10, c + 1);
        } else {
            return zeros(n / 10, c);
        }
    }
}
