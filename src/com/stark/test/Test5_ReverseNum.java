package com.stark.test;

public class Test5_ReverseNum {

    public static void main(String[] args) {
        int num = 567;
        int r = reverse(num);
        System.out.println(r);
    }

    private static int reverse(int num) {

        boolean negativeNum = false;
        if (num < 0) {
            negativeNum = true;
            num = -num;
        }
        int prev_num = 0;
        int rev_num = 0;

        while (num > 0) {
            int current = num % 10;
            rev_num = rev_num * 10 + current;

            //check for overflow,if (rev_num - current) / 10 == prev_num is equal then there is no problem
            // but if it's not then there will be overflow in the program
            if ((rev_num - current) / 10 != prev_num) {
                System.out.println("OVERFLOWED!!!!");
                return 0;
            }
            prev_num = rev_num;
            num = num / 10;
        }

        return (negativeNum) ? -rev_num : rev_num;

    }

}
