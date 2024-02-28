package com.stark.recursion.array;

import java.util.ArrayList;

public class Prac {


    public static void main(String[] args) {

        int[] arr = {2, 6, 1, 3, 11, 56, 3};
        ArrayList<Integer> search = search(arr, 3, 0, new ArrayList<>());
        System.out.println(search);
    }


    private static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return search(arr, target, index + 1, list);

    }
}
