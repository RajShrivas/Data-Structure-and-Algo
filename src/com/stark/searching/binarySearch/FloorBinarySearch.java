package com.stark.searching.binarySearch;

public class FloorBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 4, 6, 8, 9, 22, 35, 63};
        int target = 64;
        int result = floorSearch(arr, target);
        System.out.println(result);
    }

    private static int floorSearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
