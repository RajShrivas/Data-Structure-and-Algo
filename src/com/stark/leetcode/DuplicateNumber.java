package com.stark.leetcode;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] num = {3, 1, 3, 4, 2};
        int result = duplicateNumber(num);
        System.out.println(result);
    }

    public static int duplicateNumber(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }

        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
