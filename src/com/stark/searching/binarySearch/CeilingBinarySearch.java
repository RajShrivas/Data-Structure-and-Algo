package com.stark.searching.binarySearch;

public class CeilingBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 4, 6, 8, 9, 22, 35, 63};
        int target = 7;
        int result = ceilingSearch(arr, target);
        System.out.println(result);
    }

    //Ceiling  is the smallest element in an array greater than or equal to target
    private static int ceilingSearch(int[] arr, int target) {
        if (arr.length == 0 || target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
