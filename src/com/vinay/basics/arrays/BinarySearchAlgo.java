package com.vinay.basics.arrays;

import java.util.Scanner;

public class BinarySearchAlgo {

    static int binarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
        if (x==arr[mid]){
            return mid;
        } else if (x>arr[mid]) {
            low=mid+1;
        }else {
            high=mid-1;
        }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{2,5,7,10,15,17,22,25,50};
        int key=sc.nextInt();
        int result=binarySearch(arr,key);
        if (result!=-1){
            System.out.println("Element found at :"+result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
