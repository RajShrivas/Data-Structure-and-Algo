package com.stark.searching.binarySearch;

public class CeilingBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 4, 6, 8, 9, 22, 35, 63};
        int target = 33;
        int result = ceilingSearch(arr, target);
        System.out.println(result);
    }

    private static int ceilingSearch(int[] arr, int target) {
        if (arr.length == 0) {
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
