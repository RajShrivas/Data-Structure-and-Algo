package com.stark.searching.linearSearch;

import java.util.Arrays;

public class SearchIn2D {

    public static void main(String[] args) {

        int[][] arr = {{33, 5, 67}, {31, 53, 100}, {22, 50, 99},};
        int target = 4;

        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));

        int max = maxIn2D(arr);
        System.out.println(max);

    }

    private static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int val = arr[row][col];
                if (val == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static int maxIn2D(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0][0];
        for (int[] ints : arr) {
            for (int val : ints) {
                if (val > maxVal) {
                    maxVal = val;
                }
            }
        }
        return maxVal;
    }

}
