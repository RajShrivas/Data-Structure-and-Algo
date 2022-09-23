package com.stark.leetcode;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1000000043;
        int a = reverseNum(num);
        System.out.println(a);
    }

    private static int getReverseNumber(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num /= 10;
        }
        return rev_num;
    }


    private static int reverseNum(int num) {
        boolean negativeNum = false;
        if (num < 0) {
            negativeNum = true;
            num = -num;
        }
        int pre_num = 0;
        int rev_num = 0;

        while (num > 0) {
            int curr_digit = num % 10;
            rev_num = rev_num * 10 + curr_digit;
            // checking if the reverse overflowed or not.
            // The values of (rev_num - curr_digit)/10 and
            // prev_rev_num must be same if there was no
            // problem.
            if ((rev_num - curr_digit) / 10 != pre_num) {
                System.out.println("WARNING OVERFLOWED!!");
                return 0;
            }
            pre_num = rev_num;
            num = num / 10;
        }
        return (negativeNum) ? -rev_num : rev_num;
    }

}
