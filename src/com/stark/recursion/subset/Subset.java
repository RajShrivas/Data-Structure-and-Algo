package com.stark.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class Subset {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> list = subSet(arr);
        System.out.println(list);
    }


    private static void subset(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

    }


    private static List<List<Integer>> subSet(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                System.out.println(outer.get(i));
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                System.out.println(internal);
                internal.add(num);
                System.out.println(internal);
                outer.add(internal);
            }
        }
        return outer;
    }


    private static ArrayList<String> subsetRet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p + ch, up.substring(1));
        ArrayList<String> right = subsetRet(p, up.substring(1));

        left.addAll(right);

        return left;

    }
}
