package com.stark.searching.binarySearch;

public class RotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7, 10, 0, 1, 2};
        int target = 1;
        int result = searchInRotated(arr, target);
        System.out.println("targeted element is at index :: " + result);
    }

    private static int searchInRotated(int[] arr, int target) {
        int pivot = searchPivotInRotatedSortedArray(arr);
        System.out.println("pivot element is at index :: " + pivot);
        //if you do not find pivot mean array is not sorted
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target > arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
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

    //this will not work with duplicate values
    private static int searchPivotInRotatedSortedArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            //1st case
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //2nd case
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //3rd case
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                //4th case
                start = mid + 1;
            }
        }
        return -1;
    }
}
