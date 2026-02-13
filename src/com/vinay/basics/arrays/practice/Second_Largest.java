package com.vinay.basics.arrays.practice;

public class Second_Largest {


        static int findSecondLargest(int[] arr) {
            if (arr.length < 2) {
                return -1;
            }

            int largest = arr[0];
            int secondLargest = -1;

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if (arr[i] < largest && arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            int[] arr = {10, 5, 20, 8};

            int result = findSecondLargest(arr);
            System.out.println("Second Largest: " + result);
        }
    }

