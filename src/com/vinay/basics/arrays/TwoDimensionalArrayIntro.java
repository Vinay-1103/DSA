package com.vinay.basics.arrays;

import java.util.Scanner;

public class TwoDimensionalArrayIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][] marks=new double[2][];//{{1,2,3},{9,8,7}};
        marks[0]=new double[2];
        marks[1]=new double[3];
        System.out.println("Enter marks :");
        for (int i=0;i<marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                marks[i][j]=sc.nextDouble();
            }
        }

       /* System.out.println(Arrays.deepToString(marks));

        for (double[] element:marks){
            System.out.println(Arrays.toString(element));
        }
        System.out.println();*/

        for (double[] element:marks){
            for (double x:element){
                System.out.println();
            }
        }
//
//
        for (int i=0;i< marks.length;i++){
            for (int j=0;j< marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
//
//        System.out.println(marks[1][0]);
    }
}
