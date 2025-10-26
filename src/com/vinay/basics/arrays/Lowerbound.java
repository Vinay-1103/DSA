package com.vinay.basics.arrays;

public class Lowerbound {

    static int lowerbound(int[] arr,int target){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,5,10,15,19,19,25,50};
        int target=4;
        int result=lowerbound(arr,target);
        System.out.println(result);
    }

}
