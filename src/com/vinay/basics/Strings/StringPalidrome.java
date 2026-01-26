package com.vinay.basics.Strings;

public class StringPalidrome {
    public static void main(String[] args) {
        String str="Civic".toLowerCase();
//        StringBuilder sb=new StringBuilder(str);
        int left=0,right=str.length()-1;
        boolean isPalidrome = true;
        while(left<right){
            if (str.charAt(left)!=str.charAt(right)){
                isPalidrome=false;
                break;
            }
            left++;
            right--;
        }
        if (!isPalidrome){
            System.out.println("String is not paildrome");
        }
        else {
            System.out.println("String is Palidrome");
        }
    }
}
