package com.vinay.basics.arrays.practice;

import java.util.Arrays;

public class ReverseArray {

    static int[] reverseArray(int[] arr){
        int low=0,high=arr.length-1;
        while (low<=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={7,8,2,5,9,4};
        System.out.println(Arrays.toString(arr));
        int[] rev=reverseArray(arr);
        System.out.println(Arrays.toString(rev));
    }
}
