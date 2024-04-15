package com.stark.recursion.sort;

import java.util.Arrays;

public class BubbleSortRecursion {

    public static void main(String[] args) {

        int[] arr = {3, 12, 5, 13, 60};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
            sort(arr, i, j + 1);
        } else {
            sort(arr, i - 1, 0);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}


