package com.vinay.basics.arrays;

import java.util.Scanner;

public class ArrayDemo {
//    static int[] numbers;

    public static void main(String[] args) {
//        int[] numbers;/
//        numbers= new int[5];
//        numbers=new int[] {1,2,3,4,5,6};
//        int[] numbers=new int[]{6,5,9,4,8,7};
//        int[] numbers={6,5,9,4,8,7};

        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];

        System.out.println("Enter numbers: ");
        for (int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Elements entered are: ");
        for (int i:numbers){
            System.out.println(i);
        }

//        System.out.println(numbers[0]);
    }
}
