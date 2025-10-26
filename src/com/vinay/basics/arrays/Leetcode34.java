package com.vinay.basics.arrays;

import java.util.Arrays;

//firstAndlast position of element on sorted array{5,7,7,8,8,10} target=8 o/p:[3,4 ]

public class Leetcode34 {
//    bruteforce
    /*static int[] firstAndlastPosition(int[] nums,int target){
        int[] result={-1,-1};
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                if (result[0]==-1){
                    result[0]=i;
                }
                result[1]=i;
            }
        }
        return result;
    }*/


//    Binaray approach
    /*static int firstPosition(int[] nums,int target){
        int low=0,high=nums.length-1;
        int first=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]==target){
                first=mid;
                high=mid-1;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return first;
    }

    static int lastPosition(int[] nums,int target){
        int low=0,high= nums.length-1;
        int last=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]==target){
                last=mid;
                low=mid+1;
            } else if (nums[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return last;
    }

    static int[] firstAndlastPosition(int[] nums,int target){
        int[] result={-1,-1};
        int first=firstPosition(nums,target);
        if (first==-1){
            return result;
        }
//        lastPosition(nums, target);
        return new int[]{first,lastPosition(nums, target)};
    }*/

//    lowerbound Upperbound
    static int lowerBound(int[] nums,int target){
        int low=0,high= nums.length-1;
        int lb= nums.length;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]>=target){
                lb=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return lb;
    }
    static int upperBound(int[] nums,int target){
        int low=0,high= nums.length-1;
        int ub= nums.length;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]>target){
                ub=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ub;
    }
    static int[] firstAndlastPosition(int[] nums,int target){
        int[] result={-1,-1};
        int lb=lowerBound(nums,target);
        if (lb==nums.length || nums[lb]!=target){
            return result;
        }
        int ub=upperBound(nums, target);
        result[0]=lb;
        result[1]=ub-1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=7;
        int[] result=firstAndlastPosition(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
