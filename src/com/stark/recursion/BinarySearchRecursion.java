package com.stark.recursion;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 4, 6, 8, 9, 22, 35};
        int target = 4;
        int result = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(result);
    }


    private static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, e);
        } else {
            return binarySearch(arr, target, s, mid - 1);
        }
    }

}
