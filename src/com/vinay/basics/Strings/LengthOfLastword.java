package com.vinay.basics.Strings;

public class LengthOfLastword {
    public static void main(String[] args) {
        String s=" hello world   ";
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        System.out.println("Word length: " + count);
    }
}
