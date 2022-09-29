package com.stark.sorting.cyclicSort;

public class MissingNumber {

    public static void main(String[] args) {
        int[] num = {1, 0, 3};
        int result = missing(num);
        System.out.println(result);
    }

    private static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            //if '0' is present in the array, So we will not do arr.length -1, cause 0 value is present in
            //0th index of the array so if we do arr.length-1 it will give
            //us array out of bound index error
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
