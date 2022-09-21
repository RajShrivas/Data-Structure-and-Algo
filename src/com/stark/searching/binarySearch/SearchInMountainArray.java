package com.stark.searching.binarySearch;

public class SearchInMountainArray {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 3, 2, 1};
        int peak = peakOfMountainArray(arr);

        int a = orderAgnosticBS(arr, 5, 0, peak);
        int b = orderAgnosticBS(arr, 2, peak + 1, arr.length - 1);
        System.out.println(a);
        System.out.println(b);

    }

    private static int peakOfMountainArray(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }


    private static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}









































