package com.stark.searching.binarySearch;

//Also known as Bi-tonic array
public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 6, 3, 2, 1};
        int result = peakOfMountainArray(arr);
        System.out.println(result);
    }

    private static int peakOfMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                //Means you are in the increasing part of array
                start = mid + 1;
            } else {
                //Means you are in the decreasing part of array
                //this may be the answer but look at left side of the array
                //that is why  end!= mid - 1
                end = mid;
            }
        }
        return start;//start or end
    }
}
