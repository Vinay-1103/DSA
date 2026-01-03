package com.vinay.basics.arrays;

public class Leetcode26 {
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int track = 0;  // last unique element index

            for (int scan = 1; scan < nums.length; scan++) {
                if (nums[scan] != nums[track]) {
                    track++;
                    nums[track] = nums[scan];
                }
            }

            return track + 1;
        }

    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,5,6,6};
        int res=removeDuplicates(arr);
        System.out.println(res);
    }

}
