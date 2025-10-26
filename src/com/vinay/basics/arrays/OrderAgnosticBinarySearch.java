package com.vinay.basics.arrays;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        boolean isAscending=false;
        if (arr[low]<arr[high]){
                isAscending=true;
        }
        while (low<=high){
            int mid=low+(high-low)/2;
            if (x==arr[mid]){
                return mid;
            }
            if (isAscending){
                if (x>arr[mid]){
                    low=mid+1;
                }
                else {
                high=mid-1;
                }
            }else {
                if (x>arr[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{2,5,7,10,15,17,22,25,50};
        int[] arr1=new int[]{50,25,22,17,15,10,7,5,2};
        int key=sc.nextInt();
        int result=orderAgnosticBinarySearch(arr1,key);
        if (result!=-1){
            System.out.println("Element found at :"+result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
