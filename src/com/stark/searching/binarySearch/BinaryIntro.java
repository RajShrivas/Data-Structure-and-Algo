package com.stark.searching.binarySearch;

public class BinaryIntro {

    public static void main(String[] args) {

        int[] arr = {-4, -1, 4, 6, 8, 9, 22, 35, 63, 79, 88, 91, 95, 99};
        int target =35;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //it might be possible that (start+end) exceeds the limit
            int mid = start + (end - start) / 2;
            //if target value is less than array mid-value that take the array of the left side
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                //if target value is greater than array mid-value that take the array of the right side
                start = mid + 1;
            } else {
                //or else return the mid-one itself
                return mid;
            }
        }
        return -1;
    }
}

