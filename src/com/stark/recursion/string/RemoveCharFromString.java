package com.stark.recursion.string;

public class RemoveCharFromString {


    public static void main(String[] args) {

        String str = "sbbapples";
        System.out.println(removeApple(str));
    }

    private static void removeCharFromStr(String mod, String str) {

        if (str.isEmpty()) {
            System.out.println(mod);
            return;
        }

        char ch = str.charAt(0);
        if (ch == 'b') {
            removeCharFromStr(mod, str.substring(1));
        } else {
            removeCharFromStr(mod + ch, str.substring(1));
        }
    }


    private static String removeCharFromSt(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'b') {
            return removeCharFromSt(str.substring(1));
        } else {
            return ch + removeCharFromSt(str.substring(1));
        }
    }


    private static String removeApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return removeApple(str.substring(5));
        } else {
            return str.charAt(0) + removeApple(str.substring(1));
        }
    }
}
