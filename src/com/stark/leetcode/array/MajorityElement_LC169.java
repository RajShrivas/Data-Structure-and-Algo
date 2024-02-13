package com.stark.leetcode.array;

public class MajorityElement_LC169 {

    public static void main(String[] args) {

        int[] arr = {3, 3, 2, 2, 1, 2, 3, 3};
        System.out.println(majority(arr));
    }

    private static int majority(int[] arr) {
        int count = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
            }
            if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
