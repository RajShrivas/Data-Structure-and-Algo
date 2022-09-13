package com.stark.leetcode;

public class GreaterLetterThanTarget {

    public static void main(String[] args) {
        char[] arr = new char[]{'c', 'f', 'k'};
        char target = 'l';
        int result = greaterLetterThanTarget(arr, target);
        char r = (char) result;
        System.out.println(r);
    }

    private static char greaterLetterThanTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr[mid];
            if (target < value) {
                end = mid - 1;
            } else if (target > value) {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
