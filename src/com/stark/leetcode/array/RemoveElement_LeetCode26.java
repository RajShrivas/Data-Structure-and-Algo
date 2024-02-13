package com.stark.leetcode.array;

import java.util.Arrays;

public class RemoveElement_LeetCode26 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 3, 4};
        int a = removeDuplicateElement(nums);
        System.out.println(a);
    }

    private static int removeDuplicateElement(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));

        return j + 1;
    }


    private static int removeEl(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (isHavingZero(arr)) {
                int correct = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != j) {
                        return j;
                    }
                }

            } else {
                int correct = arr[i] - 1;
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != j + 1) {
                        return j + 1;
                    }
                }
            }
        }


        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    private static boolean isHavingZero(int[] arr) {
        for (int j : arr) {
            if (j == 0) {
                return true;
            }
        }
        return false;
    }
}
