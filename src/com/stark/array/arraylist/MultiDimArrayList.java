package com.stark.array.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                list.get(i).add(sc.nextInt());
            }

            System.out.println(list);
        }

    }


    private static void multiArrayList() {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        list.add(l);
        list.add(l2);

        for (ArrayList<Integer> integers : list) {

            System.out.println(integers);
        }
    }
}
