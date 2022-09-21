package com.stark.searching.binarySearch;

public class NumberOfCountInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 10, 0, 1};
        //binary approach
        int pivot = searchPivot(arr);
        //simple approach
        int noOfRotation = numberOfCounts(arr);
        int noOfRot = numberOfCount(arr);
        //pivot + 1 is always be the number of rotation in an array
        System.out.println(pivot + 1);
        System.out.println(noOfRot);
    }

    //binary approach
    private static int searchPivot(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    //simple approach
    private static int numberOfCounts(int[] arr) {
        int min = arr[0];
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }


    private static int numberOfCount(int[] arr) {
        int min = arr[0];
        int count = 0;
        for (int j : arr) {
            if (min < j) {
                count++;
            }
        }
        return count + 1;
    }
}
