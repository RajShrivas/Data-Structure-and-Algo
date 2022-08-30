package com.stark.linearSearch;

public class StringSearch {

    public static void main(String[] args) {

        String name = "Vedika";
        char target = 'a';

        boolean result = linearSearchWithForEach(name, target);
        System.out.println(result);
    }

    //Performing search with for loop
    private static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (c == target) {
                return true;
            }
        }
        return false;
    }


    //Performing search with enhanced for loop
    private static boolean linearSearchWithForEach(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
