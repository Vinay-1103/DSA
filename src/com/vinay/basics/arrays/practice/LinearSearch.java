package com.vinay.basics.arrays.practice;

import com.vinay.basics.arrays.SentinalLinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    //General method
    public static int linearSearch(int[] arr,int key){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    //Transposition method
    public static int TransLinearSearch(int[] arr,int key){
        for (int i =0;i<arr.length;i++){
            if(key == arr[i]){
                if (i>0){
                    int temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    return i-1;
                }
                return i;
            }
        }
        return -1;
    }

    //    Move to front
    static int MoveToFront(int[] arr,int key){
        for (int i =0;i<arr.length;i++){
            if(key == arr[i]){
                if (i>0){
                    int temp = arr[i];
                    arr[i]=arr[0];
                    arr[0]=temp;
                    return 0;
                }
                return i;
            }
        }
        return -1;
    }

//    Bidirectional Search



    public static void main(String[] args) {
        int[] numbers = new int[]{34,54,21,61,24,87,94};
        int key;
        System.out.println();
        System.out.println("Enter a Key : ");
        Scanner sc = new Scanner(System.in);
        key=sc.nextInt();
        int result ;
//        result= linearSearch(numbers,key);
//        result=TransLinearSearch(numbers,key);
        result= MoveToFront(numbers,key);
        if(result!=-1){
            System.out.println("Element found at index "+result);
        }
        else {
            System.out.println("Element not found");
        }

        for (int element: numbers){
            System.out.print(element+" ");
        }
    }
}
