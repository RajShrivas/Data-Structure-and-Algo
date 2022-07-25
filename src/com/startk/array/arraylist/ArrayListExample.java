package com.startk.array.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
