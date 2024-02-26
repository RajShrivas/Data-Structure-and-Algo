package com.stark.recursion.array;

public class Sorted {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 13, 15};
        System.out.println(sorted(arr, 0));
    }

    private static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
