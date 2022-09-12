package com.stark.searching.linearSearch;

public class WealthProblem {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 2, 3},
                {1, 5, 7}};

        wealthSum(arr);

    }

    private static void wealthSum(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            System.out.println(sum);
        }
    }
}
