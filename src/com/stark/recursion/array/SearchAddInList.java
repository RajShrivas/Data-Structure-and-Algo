package com.stark.recursion.array;

import java.util.ArrayList;

public class SearchAddInList {


    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 15, 13, 15};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> search = search2(arr, 15, 0);
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


    private static ArrayList<Integer> search2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> newList = search2(arr, target, index + 1);
        list.addAll(newList);

        return list;
    }
}
