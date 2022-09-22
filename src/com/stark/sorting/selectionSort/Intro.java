package com.stark.sorting.selectionSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {
        int[] arr = {3, 1, 12, 11, 13};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty array");
        }
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - i - 1;
            int maxIndex = getIndexOfMax(arr, start, end);
            swap(arr, maxIndex, end);
        }
    }

    private static int getIndexOfMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
