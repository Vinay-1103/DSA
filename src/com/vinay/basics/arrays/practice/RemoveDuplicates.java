package com.vinay.basics.arrays.practice;

import java.util.Arrays;

public class RemoveDuplicates {
    static int[] removeDuplicates(int[] arr){
        if(arr.length == 0) return arr;

        int i=0;
        for (int j=1 ; j<arr.length ; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return Arrays.copyOf(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr={2,5,9,9,14};
//        System.out.println(Arrays.toString(arr));
        int[] rev=removeDuplicates(arr);
        System.out.println(Arrays.toString(rev));
    }
}
