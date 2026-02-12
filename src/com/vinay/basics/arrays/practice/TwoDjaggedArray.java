package com.vinay.basics.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDjaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[2][];
        marks[0] = new int[3];
        marks[1] = new int[5];
        System.out.println("Enter your marks");
        for (int i = 0 ;i<marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                marks[i][j] = sc.nextInt();
            }
        }
        for (int[] element: marks){
            System.out.println(Arrays.toString(element));
        }
        System.out.println();
    }
}
