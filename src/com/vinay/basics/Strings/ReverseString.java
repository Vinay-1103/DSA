package com.vinay.basics.Strings;

public class ReverseString {
    public static void main(String[] args) {

        //Approach 1
       /* String str="Vinay Kumar 123";
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }*/

        //Approach 2
        /*String str="Vinay Kumar 123";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);*/

        //Approach 3
        /*String str="Vinay Kumar 123";
        String str1="";
        StringBuilder sb=new StringBuilder(str1);
        for (int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());*/

        //Apporach 4
        String str="Vinay Kumar 123@";
        StringBuilder sb=new StringBuilder(str);
        int left=0,right=str.length()-1;
        while (left<right){
            char leftChat=sb.charAt(left);
            char rightChar= sb.charAt(right);

            sb.setCharAt(left,rightChar);
            sb.setCharAt(right,leftChat);

            left++;
            right--;
        }
        System.out.println(sb);
    }
}
