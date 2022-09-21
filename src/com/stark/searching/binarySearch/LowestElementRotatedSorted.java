package com.stark.searching.binarySearch;

public class LowestElementRotatedSorted {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 1};
        //or simply we can return the next element of the pivot element
        int lowestElementInArray = lowestElement(arr);
        System.out.println("lowest element index at :: " + lowestElementInArray);
    }


    private static int lowestElement(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
            return arr[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int[] a = {2, 3, 4, 5, 1};
            // if the mid-element is greater than its next element then mid+1 element is the smallest
            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            // if the mid-element is less than its previous element then return mid-element
            if (arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
