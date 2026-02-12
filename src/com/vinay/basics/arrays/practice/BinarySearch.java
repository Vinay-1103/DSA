package com.vinay.basics.arrays.practice;

import java.util.Scanner;

public class BinarySearch {
     static int OrderAgnosticBinarySearch(int[] arr,int x){
         int low=0;
         int high= arr.length-1;
         boolean isAscending = arr[low]<arr[high];
         while (low<=high){
             int mid = low+(high-low)/2;
             if (arr[mid]==x){
                 return mid;
             }
             if(isAscending){
                 if(x>arr[mid]){
                     low=mid+1;
                 }else {
                     high=mid-1;
                 }
             }else {
                 if (x>arr[mid]){
                     high=mid-1;
                 }else {
                     low=mid+1;
                 }
             }
         }
         return -1;
     }


    public static void main(String[] args) {
        int[] arr=new int[]{2,5,8,16,34};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to search ");
        key=sc.nextInt();
        int result = OrderAgnosticBinarySearch(arr,key);
        if(result!=-1){
            System.out.println("Element found at index "+result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
