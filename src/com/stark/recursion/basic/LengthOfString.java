package com.stark.recursion.basic;

public class LengthOfString {

    public static void main(String[] args) {

        int i = calLength("Raj", 0);
        System.out.println(i);
    }

    private static int calLength(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        return 1 + calLength(str, index + 1);
    }
}
