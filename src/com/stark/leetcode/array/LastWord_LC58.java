package com.stark.leetcode.array;

public class LastWord_LC58 {


    public static void main(String[] args) {
        int a = lengthOfLastWord("Hello Pooja  ");
        System.out.println(a);
    }

    private static int lengthOfLastWord(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    return count;
                }
            }
        }
        return count;
    }


    public static int lengthOfLastWord2(String s) {
        String myStr = s.trim();
        String[] str = myStr.split(" ");
        return str[str.length - 1].length();
    }
}
