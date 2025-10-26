package com.vinay.basics.arrays;



//Insert position finding in an array
public class Leetcode35 {
//    Liner
    /*public static int SearchInsert(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;

    }*/


//    binaray without duplicates
    /*public static int SearchInsert(int[] nums,int target){
        int low=0,high=nums.length-1;
        int pos=nums.length;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                pos=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return pos;
    }*/

//    with duplicates
    static int SearchInsert(int[] nums,int target){
        int low=0,high=nums.length-1;
        int pos=nums.length;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]>=target){
                pos=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr={10,12,32,51,64,80,91};
        int x=35;
        int res=SearchInsert(arr,x);
        System.out.println(res);
    }
}
