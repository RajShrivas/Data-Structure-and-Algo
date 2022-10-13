package com.stark.patterns;

public class PatternPractice {

    public static void main(String[] args) {
        patternSeven(5);
    }


    private static void patternOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patternTwo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patternThree() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patternFour() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    private static void patternFive(int n) {

//   *
//   * *
//   * * *
//   * * * *
//   * * *
//   * *
//   *

        for (int i = 0; i < 2 * n; i++) {
            int totalNumCol = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalNumCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    private static void patternSix(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalNumCol = i > n ? 2 * n - i : i;
            int spaces = n - totalNumCol;
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalNumCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    private static void pyramid(int n) {
        for (int i = 0; i <= n; i++) {
            int space = n - i;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }


    private static void patternSeven(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + "");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + "");
            }

            System.out.println();
        }

    }

}
