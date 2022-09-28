package com.stark.test;

import java.util.Arrays;

public class Test6_BinarySearch2D {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45},
                {27, 28, 37, 49}, {33, 34, 38, 50}};
        int target = 25;
        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] search(int[][] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }
        int row = 0;
        int column = arr.length - 1;
        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                return new int[]{row, column};
            }
            if (target < arr[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
