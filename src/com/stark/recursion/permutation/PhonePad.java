package com.stark.recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {


    public static void main(String[] args) {
        letterPad("", "12");
        System.out.println(letterPadReturn("", "12"));
    }


    private static void letterPad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            letterPad(p + ch, up.substring(1));
        }
    }

    private static List<String> letterPadReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(p);
            return arrayList;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(letterPadReturn(p + ch, up.substring(1)));
        }
        return list;
    }
}
