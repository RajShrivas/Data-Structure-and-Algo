package com.stark.array.intro;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 9, 10};
        int index1 = 0;
        int index2 = 3;
        int[] a = swap(arr, index1, index2);
        System.out.println(Arrays.toString(a));
    }

    private static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }
}
