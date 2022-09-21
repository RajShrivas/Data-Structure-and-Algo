package com.stark.searching.binarySearch;

//Find position of an element in a sorted array of infinite numbers.
public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 95, 99, 101};
        int target = 90;
        int result = findPos(arr, target);
        System.out.println(result);

    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int findPos(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while (arr[high] < target) {
            low = high; //store previous end
            high = 2 * high;
        }
        return binarySearch(arr, low, high, target);
    }
}