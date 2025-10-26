package com.vinay.basics.arrays;

public class Upperbound {
    static int upperbound(int[] arr,int target){
        int low=0,high=arr.length-1,ub=arr.length;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]>target){
                ub=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ub;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,10,15,15,18,20};
        int target=4;
        int result=upperbound(arr,target);
        System.out.println(result);
    }
}
