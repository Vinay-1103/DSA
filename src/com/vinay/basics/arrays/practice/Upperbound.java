package com.vinay.basics.arrays.practice;

import java.util.Scanner;

public class Upperbound {
    static int upperBound(int[] arr,int target){
        int low = 0,high=arr.length-1;
        int ub=arr.length;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid] > target) {
                ub=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return ub-1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,5,8,11,16,16,16,34};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to search ");
        key=sc.nextInt();
        int result = upperBound(arr,key);
        if(result!=-1){
            System.out.println("Element found at index "+result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
