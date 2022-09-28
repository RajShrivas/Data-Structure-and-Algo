package com.stark.sorting.cyclicSort;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 7, 6, 8};
        cyclicSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //with while loop
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    //with for-loop
    private static void cyclicSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            }
        }
    }
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
