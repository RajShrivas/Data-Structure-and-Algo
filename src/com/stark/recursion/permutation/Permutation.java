package com.stark.recursion.permutation;

public class Permutation {


    public static void main(String[] args) {
        //permutation("", "abc");
        System.out.println(permutationCount("", "abcd"));
    }


    private static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutation(f + ch + s, up.substring(1));
        }
    }


    private static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count = count + permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }

}
