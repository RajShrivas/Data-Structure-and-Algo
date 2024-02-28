package com.stark.recursion.sort;

import java.util.Arrays;

public class BubbleSortRecursion {

    public static void main(String[] args) {

        int[] arr = {3, 12, 5, 13, 60};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            sort(arr, r, c + 1);
        } else {
            sort(arr, r - 1, 0);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}


