package com.stark.test;

public class Test4_InfiniteSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 95, 99, 101};
        int target = 10;
        int r = findPos(arr, target);
        System.out.println(r);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
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
        return -1;
    }

    private static int findPos(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            start = end;
            end = end * 2;
        }
        return binarySearch(arr, start, end, target);
    }


}
