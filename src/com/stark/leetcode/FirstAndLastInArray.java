package com.stark.leetcode;

import java.util.Arrays;

public class FirstAndLastInArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 8, 8, 8, 8, 9, 11};
        int target = 8;
        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] search(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = firstAndLastOccur(arr, target, true);
        int end = firstAndLastOccur(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    private static int firstAndLastOccur(int[] arr, int target, boolean isFirstOccur) {
        if (arr.length == 0) {
            return -1;
        }
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstOccur) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
