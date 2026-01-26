package com.vinay.basics.Strings;

import java.util.Scanner;

public class countVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        VowelsAndConsonants(str.toLowerCase());
    }

    static void VowelsAndConsonants(String str) {
        int vowelCount=0,consonantCount=0;
        for (int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if (ch=='a' || ch=='i' || ch =='o' ||ch=='u'||ch =='e') {
            vowelCount++;
            } else if (ch>='a' && ch<='z') {
            consonantCount++;
            }
        }
        System.out.println("Number of vowels are : "+vowelCount+"\nNumber of consonants are: "+consonantCount);
    }
}
