package com.stark.searching.binarySearch;

import java.util.Arrays;

public class BinarySearch2D {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45},
                {27, 28, 37, 49}, {33, 34, 38, 50}};

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}};
        int target = 9;
        int[] result = searchIn2DBS(arr2, target);

        System.out.println(Arrays.toString(result));
    }

    // binary approach
    private static int[] searchIn2DBS(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }


    // simple approach
    private static int[] searchIn2D(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int value = arr[row][col];
                if (value == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
