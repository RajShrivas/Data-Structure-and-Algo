package com.stark.searching.binarySearch;

public class OrderAgnosticSearch {

    public static void main(String[] args) {
        //int[] arr = {-4, -1, 4, 6, 8, 9, 22, 35, 63, 79, 88, 91, 95, 99};
        int[] arr2 = {98, 92, 81, 77, 65, 43, 33, 31, 28, 22, 11, 6};
        int target = 81;
        int result = orderAgnosticBS(arr2, target);
        System.out.println(result);
    }

    private static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
