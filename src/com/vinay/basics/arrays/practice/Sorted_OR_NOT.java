package com.vinay.basics.arrays.practice;

public class Sorted_OR_NOT {

    static boolean sortornot(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={0,1,6,9,14};
        boolean result = sortornot(arr);
        System.out.println(result);
    }
}
