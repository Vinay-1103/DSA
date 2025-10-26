package com.vinay.basics.arrays;

import java.util.Arrays;

public class LinearSearchalgo {
    static int linearSearch(int[] arr1,int x){
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]==x){
//                int originalindex=i;
//                System.out.println(i);
//                transposition
                if (i>0){
                    int temp=arr1[i];
                    arr1[i]=arr1[i-1];
                    arr1[i-1]=temp;
                    return i-1;
                }
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{50,81,94,64,31,110,8,46};
        int key=64;
        int result=linearSearch(arr,key);
        if (result!=-1){
            System.out.println("Element found at :"+result);
        }
        else {
            System.out.println("Element not found");
        }
        System.out.println(Arrays.toString(arr));
    }
}
