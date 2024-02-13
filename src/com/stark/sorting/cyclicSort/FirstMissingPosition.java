package com.stark.sorting.cyclicSort;

import java.util.Arrays;

public class FirstMissingPosition {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 4, 2, 1};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != (j + 1)) {
                return j + 1;
            }
        }
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
