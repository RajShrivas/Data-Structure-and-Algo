package com.stark.searching.binarySearch;

public class Binary2DSortedMartix {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8},
                {9, 10, 11, 12}, {13, 14, 15, 16}};
        int target = 3;
        int[] result = search(arr, target);
    }


    //search in the row between the columns provided
    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    private static int[] search(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return new int[]{-1, -1};
        }
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        //run the loop till2 rows are remaining
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }


        return new int[]{-1, -1};
    }
}
