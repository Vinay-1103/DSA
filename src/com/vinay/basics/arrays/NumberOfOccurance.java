package com.vinay.basics.arrays;

import java.util.Arrays;

public class NumberOfOccurance {
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
    static int countOccurence(int[] arr,int target){
        int count=0;
        int[] answer=firstAndlastPosition(arr,target);
        if (answer[0]==-1){
            return 0;
        }
        count=(answer[1]-answer[0])+1;
        return count;
    }
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=7;
        int result=countOccurence(arr,target);
        System.out.println(result);
    }

}
