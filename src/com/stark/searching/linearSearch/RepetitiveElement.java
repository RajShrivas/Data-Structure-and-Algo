package com.stark.searching.linearSearch;

public class RepetitiveElement {

    public static void main(String[] args) {
        int[] arr
                = new int[]{9, 8, 2, 6, 1, 5, 5, 3, 4, 7};
        int repeatingNum = repetitiveElement(arr);

        System.out.println(repeatingNum);
    }

    private static int repetitiveElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int val = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    val = arr[i];
                    break;
                }
            }
        }
        return val;
    }
}
