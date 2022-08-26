package com.stark.array.multidimensional;

public class MultiDimensionalArray {

    static int input;

    public static void main(String[] args) {

        int[][] arr = new int[3][];

        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printOutput(arr2D);



    }


    public static void printOutput(int[][] arr){
 /*       for (int row = 0; row < arr.length ; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                input= arr[row][col] ;
                System.out.print(input + " ");
            }

            System.out.println();

        }*/


        //Another approach

        for (int row = 0; row < arr.length ; row++) {
            int[] ar = arr[row];

            for (int col = 0; col < ar.length; col++) {

                int r = ar[col];

                System.out.print(r +" ");
            }

            System.out.println();
        }


    }
}
