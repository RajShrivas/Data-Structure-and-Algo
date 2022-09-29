package com.stark.leetcode;

import java.util.Arrays;

public class TwoSums {

    public static void main(String[] args) {
        int[] num = {2, 5, 5, 11};
        int target = 10;
        int[] result = twoSums(num, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
