package com.vinay.basics.assesments;

public class Assesment1 {

    //PROBLEM 01
    /*static void largeNo(int[] arr1){
        int size=0;
        for (int num:arr1){
            if (num != 0){
                size++;
            }else {
                break;
            }
        }
      //        System.out.println(size);
            int large=0;
        for (int i=0;i<size;i++){
            if (large < arr1[i]){
                large=arr1[i];
            }
        }
            System.out.println(large);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,8,3,6,7,9};
        largeNo(arr);
    }*/


//    PROBLEM 02

   /* static void EvenOdd(int[] arr){
        int size=0;
        for (int num:arr){
            if (num!=0){
                size++;
            }else {
                break;
            }
        }

            int even=0,odd=0;
        for (int i=0;i<size;i++){
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even elements :"+even+" Odd are :"+odd);
    }

    public static void main(String[] args) {
        int[] arr={12,15,6,9,45,22,5,7,9};
        EvenOdd(arr);
    }*/

//    Problem03
    static int SortedOrNot(int[] arr){
        int size=0;
        for (int num:arr){
            if(num!=0){
                size++;
            }else {
                break;
            }
        }
        for (int i=0;i<size;i++){
            if(arr[i]<arr[i+1]){
                arr[i]++;
            }
            else {
                break;
            }
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 3, 6, 7, 9};
        int result=SortedOrNot(arr);
        if (result==-1){
            System.out.println("Array is not sorted");
        }
        else {
            System.out.println("Sorted");
        }
    }
}
