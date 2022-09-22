package com.stark.test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty array");
        }
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, start, end);
            swap(arr, maxIndex, end);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
