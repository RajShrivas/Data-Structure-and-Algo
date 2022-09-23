package com.stark.test;

public class Test3_MountainArray {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 7, 9, 2, 1, 0};
        int r = mountainArray(array);
        System.out.println(r);
    }

    private static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
