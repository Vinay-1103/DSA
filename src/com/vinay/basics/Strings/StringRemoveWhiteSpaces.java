package com.vinay.basics.Strings;

public class StringRemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="Vinay \nKumar \t123";
//        System.out.println(str.replaceAll("\\s",""));
//        String str1="";
        int i=0;
        StringBuilder sb=new StringBuilder();
        while (i<str.length()){
            char ch=str.charAt(i);
            if (ch!=' ' && ch!='\n' && ch!='\t'){
//                str1 += ch;
                sb.append(ch);
            }
            i++;
        }
        System.out.println(sb);
    }

}
