package com.stark.recursion.pattern;

public class Triangle {

    public static void main(String[] args) {

        tri(5, 0);
    }

    private static void triangle(int r, int c) {

        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }

    }

    private static void tri(int r, int c) {

        if (r==0){
            return;
        }

        if (r>c){
            System.out.print("*");
            triangle(r,c+1);
        }else {
            System.out.println();
            triangle(r-1,0);
        }
    }
}
