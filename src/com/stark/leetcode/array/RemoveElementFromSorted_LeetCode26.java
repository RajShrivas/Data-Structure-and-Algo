package com.stark.leetcode.array;

public class RemoveElementFromSorted_LeetCode26 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 3, 3, 4};
        int a = removeDuplicateElement(arr);
        System.out.println(a);
    }

    private static int removeDuplicateElement(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

}
