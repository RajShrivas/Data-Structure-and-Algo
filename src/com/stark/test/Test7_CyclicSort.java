package com.stark.test;

import java.util.Arrays;

public class Test7_CyclicSort {

    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 5, 2, 3, 6, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int corr = arr[i] - 1;
            if (arr[i] != arr[corr]) {
                swap(arr, i, corr);
            } else {
                i++;
            }

        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
