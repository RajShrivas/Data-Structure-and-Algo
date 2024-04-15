package com.stark.leetcode.array;

public class RemoveElement_LeetCode27 {


    public static void main(String[] args) {
        int[] num = {4, 2, 2, 3, 3, 5};
        int i = removeEl(num, 2, 0, 0);
        System.out.println(i);
    }

    private static int removeElement(int[] num, int val) {
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[j] = num[i];
                j++;
            }
        }
        return j;
    }

    private static int removeEl(int[] num, int val, int index, int j) {
        if (index > num.length - 1) {
            return j;
        }
        if (num[index] != val) {
            return removeEl(num, val, index + 1, j + 1);
        } else {
            return removeEl(num, val, index + 1, j);
        }

    }
}
