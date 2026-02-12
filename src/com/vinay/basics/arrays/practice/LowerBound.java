package com.vinay.basics.arrays.practice;

import java.util.Scanner;

public class LowerBound {
    static int lowerBound(int[] arr,int target){
        int low = 0,high=arr.length-1;
        int lb=0;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid] >= target) {
                lb=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return lb;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{16,16,16,34};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to search ");
        key=sc.nextInt();
        int result = lowerBound(arr,key);
        if(result!=-1){
            System.out.println("Element found at index "+result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
