package com.vinay.basics.arrays.practice;

public class Largest_element {

    static int largestNo(int[] arr){
        int large=arr[0];
        int i;
        for (i=1;i<arr.length;i++){
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int[] arr = {100, 7, 2, 9, 45};
        int res = largestNo(arr);
        System.out.println(res);
    }
}
