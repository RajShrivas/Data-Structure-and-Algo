package com.stark.linearSearch;

public class EvenDigit {

    public static void main(String[] args) {

        int[] arr = {45, 77, 112, 355, 1, 889};
        int res = findNumber(arr);
        System.out.println(res);

    }

    private static int findNumber(int[] num) {
        int count = 0;
        for (int i : num) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEven(int num) {
        return digitCount(num) % 2 == 0;
    }

    private static int digitCount(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
