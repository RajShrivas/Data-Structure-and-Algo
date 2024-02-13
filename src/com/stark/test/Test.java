package com.stark.test;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 8, 10, 7, 5, 2, 0};
        System.out.println(mountainArr(arr));
    }


    private static int mountainArr(int[] arr) {

        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
