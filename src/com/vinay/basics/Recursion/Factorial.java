package com.vinay.basics.Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if (n == 0 || n == 1) {   // Base case
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = fact(num);

        System.out.println("Factorial of " + num + " is: " + result);
    }
}
