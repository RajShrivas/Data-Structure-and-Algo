package com.stark.array.intro;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {33, 4, 89, 2, 1, 22};

        reverse(arr);

        System.out.println(Arrays.toString(arr));



    }


    private static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }


    private static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];

        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }
}
