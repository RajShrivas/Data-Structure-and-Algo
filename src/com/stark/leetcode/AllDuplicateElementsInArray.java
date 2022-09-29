package com.stark.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateElementsInArray {

    public static void main(String[] args) {
        int[] num = {3, 1, 3, 4, 2, 2};
        List<Integer> result = allDuplicates(num);
        System.out.println(result);
    }

    private static List<Integer> allDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if (nums.length == 0) {
            result.add(-1);
        }
        int i = 0;
        while (i < nums.length) {
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]) {
                swap(nums, i, correct_index);
            } else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(nums[j]);
            }
        }

        return result;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
