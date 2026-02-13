package com.vinay.basics.arrays.practice;

import java.util.Arrays;
import java.util.HashMap;

public class Count_Frequency {

    static void count(int[] arr){
        boolean[] visited = new boolean[arr.length];

       for (int i=0;i< arr.length;i++){
           if(visited[i]){
               continue;
           }
           int count = 1;

           for (int j=i+1;j< arr.length;j++){
               if (arr[i] == arr[j]){
                   count++;
                   visited[j]=true;
               }
           }
           System.out.println(arr[i] + " -> " + count);
       }
    }

    static void cont_freq(int[] arr1){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int num:arr1){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
    }
    }

    public static void main(String[] args) {
        int[] arr={7,8,2,2,5,9,4};
//        count(arr);
        cont_freq(arr);

    }
}
