package com.stark.linearSearch;

/*Linear Search is defined as a sequential search algorithm that starts at one end and goes through
 each element of a list until the desired element is found,otherwise the search continues till
 the end of the data set.It is the easiest searching algorithm*/

public class Intro {

    public static void main(String[] args) {

        int[] arr = {66, 23, 45, 9, 12, 5, 2};

        int result = linearSearch(arr, 23);
        int result2 = linearSearchWithForEach(arr, 23);
        System.out.println(result);
        System.out.println(result2);
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
}
