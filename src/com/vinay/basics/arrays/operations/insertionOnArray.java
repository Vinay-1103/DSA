package com.vinay.basics.arrays.operations;

public class insertionOnArray {
    public static void traverseArray(int[] arr1){

        int size=0;
        for (int num:arr1){
            if (num != 0){
                size++;
            }else {
                break;
            }
        }
        for (int i=0;i< size;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
//        System.out.println();
//        for (int i:arr1){
//            System.out.print(i+" ");
//        }
//        System.out.println();
    }

    public static void insertAtBegininning(int[] arr1, int x){
        try {

        int size=0;
        for (int num:arr1){
            if (num != 0){
                size++;
            }else {
                break;
            }
        }
        arr1[size]=arr1[0];
        arr1[0]=x;

//        for (int i= size;i>0;i--){
//            arr1[i]=arr1[i-1];
//        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void insertAtEnd(int[] arr1, int x){
        try {

            int size=0;
            for (int num:arr1){
                if (num != 0){
                    size++;
                }else {
                    break;
                }
            }
            arr1[size]=x;
            size++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void insertAtposition(int[] arr1, int pos, int x){
        try {

            int size=0;
            for (int num:arr1){
                if (num != 0){
                    size++;
                }else {
                    break;
                }
            }
            if (pos<=0 || pos>size+1){
                System.out.println("Position is not valid");
            }
            else {
                for (int i = size; i >= pos; i--) {
                    arr1[i] = arr1[i - 1];
                }
                arr1[pos - 1] = x;
                size++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[10];
//        int size=5;
        arr[0]=78;
        arr[1]=94;
        arr[2]=11;
        arr[3]=24;
        arr[4]=31;
//        arr[5]=38;
//        traverseArray(arr);
//        insertAtBegininning(arr,34);
//        size++;
//        traverseArray(arr);
//        insertAtBegininning(arr,55);
//        traverseArray(arr);
//        insertAtEnd(arr,33);
//        traverseArray(arr);
        insertAtposition(arr,3,100);
        traverseArray(arr);
    }
}
