package com.stark.sorting.bubbleSort;

import java.util.Arrays;

/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent
elements if they are in the wrong order. This algorithm is not suitable for large data
sets as its average and worst-case time complexity is quite high.*/
public class Intro {
    public static void main(String[] args) {
        //Numerical bubble sort
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        //String bubble sort
        String[] strArray = {"Thor", "Ironman", "Captain America", "Black widow", "Hawkeye"};
        bubbleSortOnString(strArray);
        System.out.println(Arrays.toString(strArray));


    }

    //bubble sort in numerical array::Algo
    private static void bubbleSort(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty array");
        }
        boolean swapped;
        //her we use i just for the number of iterations
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            int n = arr.length - i;
            //we are reduce i from the array cause there is no required to check the last digit of
            //array case it is already sorted,So the searching index will be reduced after every
            //sorting/cases
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //used swapped is to check weather array is already sorted or not
            if (!swapped) {
                break;
            }
        }
    }


    //bubble sort in string array::Algo
    private static void bubbleSortOnString(String[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty array");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
