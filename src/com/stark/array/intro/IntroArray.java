package com.stark.array.intro;

import java.util.Arrays;

public class IntroArray {

    public static void main(String[] args) {

        //syntax
        //dataType[] var_name = new dataType[size];
        int[] arr = new int[5];
        arr[0] = 5;
        arr[3] = 9;

        int[] num = {5, 77, 23, 55, 99, 443};

        //print with array method
        System.out.println(Arrays.toString(arr));


        // print with enchanced for each loop
        for (int n : num) {
            System.out.println(n);
        }

        // print with simple for loop
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
