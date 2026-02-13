package com.vinay.basics.arrays.practice;

public class FindMissingValue {

    static int missinNo(int[] arr ){
        int count=0;
        for (int n: arr){
            count++;
        }
        int n=count+1;
        int expected = n*(n+1)/2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expected-actualSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6};
        int res=missinNo(arr);
        System.out.println(res);
    }
}
