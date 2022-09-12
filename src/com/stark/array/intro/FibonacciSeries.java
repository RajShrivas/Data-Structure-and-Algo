package com.stark.array.intro;

public class FibonacciSeries {

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 5, 2, 7, 3, 4};
        fibonacciArray(arr);
    }

    private static void fibonacci() {
        int n1 = 0;
        int n2 = 1;
        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + ",");
            n1 = n2;
            n2 = n3;
        }
    }

    private static void fibonacciArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int n3 = arr[i] + arr[i + 1];
            System.out.print(n3 + ",");
            arr[i] = arr[i + 1];
            arr[i + 1] = n3;
        }
    }
}
