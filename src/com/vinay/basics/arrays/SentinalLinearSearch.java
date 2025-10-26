package com.vinay.basics.arrays;

public class SentinalLinearSearch {

    static int sentinalLinearSearch(int[] arr1,int x){
        int n=arr1.length;
        int last=arr1[n-1];
        arr1[n-1]=x;
        int i=0;
        while (arr1[i] != x){
            i++;
        }
        arr1[n-1]=last;
        if(i<n-1 || arr1[n-1]==x){
            return i;
        }else {
        return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{50,81,94,64,31,110,8,46};
        int key=110;
        int result=sentinalLinearSearch(arr,key);
        if (result!=-1){
            System.out.println("Element found at :"+result);
        }
        else {
            System.out.println("Element not found");
        }
//        System.out.println(Arrays.toString(arr));
    }
}
