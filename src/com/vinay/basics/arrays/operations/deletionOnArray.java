package com.vinay.basics.arrays.operations;

import static com.vinay.basics.arrays.operations.insertionOnArray.*;

public class deletionOnArray {
    static void deletefrombeginning(int[] arr1){
        try {

            int size=0;
            for (int num:arr1){
                if (num != 0){
                    size++;
                }else {
                    break;
                }
            }
            for (int i=0;i<size-1;i++) {
           arr1[i]=arr1[i+1];
            }
            arr1[size-1]=0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    static void deletefromEnd(int[] arr1){
        try {

            int size=0;
            for (int num:arr1){
                if (num != 0){
                    size++;
                }else {
                    break;
                }
            }

            arr1[size-1]=0;
            size--;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    static void deletefromposition(int[] arr1,int pos){
        try {
            int size=0;
            for (int num:arr1){
                if (num != 0){
                    size++;
                }else {
                    break;
                }
            }
            if (pos<=0 || pos>size) {
                System.out.println("Position is not valid");
            }
            else {
                for (int i=pos-1;i<size-1;i++) {
                arr1[i]=arr1[i+1];
                }
            arr1[size-1]=0;
                size--;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        int[] arr=new int[10];
        insertAtposition(arr,1,54);
//        traverseArray(arr);
        insertAtBegininning(arr,90);
        insertAtposition(arr,2,64);
        insertAtposition(arr,3,82);
        insertAtEnd(arr,51);
        traverseArray(arr);
//        deletefrombeginning(arr);
//        traverseArray(arr);
//        deletefromEnd(arr);
//        traverseArray(arr);
//        deletefromposition(arr,3);
//        traverseArray(arr);
    }
}


