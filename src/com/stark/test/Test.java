package com.stark.test;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 8, 10, 7, 5, 2, 0};
        int[] arr2 = {4, 7, 9, 11, 14, 17, 20};

        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr2, 0));
        System.out.println(search(arr2, 0, 66));
    }


    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    private static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }


    private static int search(int[] arr, int i, int target) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return search(arr, i + 1, target);
    }


}
