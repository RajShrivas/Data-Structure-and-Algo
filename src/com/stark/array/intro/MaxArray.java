package com.stark.array.intro;

public class MaxArray {

    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 19, 15, 84, 79};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 1, 4));
    }


    //maximum in array
    public static int max(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


    public static int maxInRange(int[] arr, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
