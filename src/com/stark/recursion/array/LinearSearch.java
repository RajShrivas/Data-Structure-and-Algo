package com.stark.recursion.array;

public class LinearSearch {


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 13, 15};
        int search = search(arr, 77, 0);
        System.out.println(search);
    }

    private static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }
}
