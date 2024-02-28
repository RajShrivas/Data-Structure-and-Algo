package com.stark.recursion.sort;

import java.util.Arrays;

public class SelectionSortRecursion {


    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr, int i, int max, int j) {
        if (i == 0) {
            return;
        }
        if (i > j) {
             if (arr[j] > arr[max]) {
                sort(arr, i, j, j + 1);
            } else {
                sort(arr, i, max, j + 1);
            }
        } else {
            swap(arr, max, i - 1);
            sort(arr, i - 1, 0, 0);
        }


    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
