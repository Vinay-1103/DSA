package com.vinay.basics.arrays.practice;

import java.util.Arrays;

public class MoveNegativesAllOneSide {
    static void moveNegatives(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr){
            if (num<0){
                result[index++]=num;
            }
        }

        for (int num:arr){
            if (num>=0){
                result[index++]=num;
            }
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr =new int[]{-13,5,7,2,-3,-4,45,-2};
        moveNegatives(arr);
    }
}
