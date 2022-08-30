package com.stark.linearSearch;

/*Linear Search is defined as a sequential search algorithm that starts at one end and goes through
 each element of a list until the desired element is found,otherwise the search continues till
 the end of the data set.It is the easiest searching algorithm*/

public class NumericalSearch {

    public static void main(String[] args) {

        int[] arr = {66, 23, 45, 9, 12, 5};

        int result = linearSearch(arr, 23);
        int result2 = linearSearchWithForEach(arr, 23);
        boolean result3 = linearSearchInRangeForEach(arr, 23, 4, 6);
        int result4 = findMin(arr);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        //otherwise we are iterating through all over the loop
        for (int index = 0; index < arr.length; index++) {
            int value = arr[index];
            if (value == target) {
                return index;
            }
        }
        return -1;
    }

    //linear search operation with enhanced for loop
    private static int linearSearchWithForEach(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        //otherwise we are iterating through all over the loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //Cause in this condition -1 might be the value in an array
        return Integer.MAX_VALUE;
    }


    //linear search operation with in a range
    private static boolean linearSearchInRangeForEach(int[] arr, int target, int start, int end) {

        if (arr.length == 0 || end >= arr.length) {
            return false;
        }
        //otherwise we are iterating through all over the loop

        for (int index = start; index <= end; index++) {
            int value = arr[index];
            if (value == target) {
                return true;
            }
        }

        return false;
    }

//find minimum value from an array
    private static int findMin(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
