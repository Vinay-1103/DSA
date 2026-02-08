package com.vinay.basics.Strings;

public class StringPractice {
    public static void main(String[] args) {
        String str="Vinay Kumar";
        String str1="vinay kumar";
        String str2=new String("Vinay Kumar");

        String word[] = str.split(" ");

        for (String words: word ){
            System.out.println(words);
        }
//        System.out.println(str1.replace("a","A"));
//        System.out.println(str1.trim());
//        System.out.println(str1.substring(2,8));
//        System.out.println(str.compareTo(str2));
//        System.out.println(str.contains("nay"));
//        System.out.println(str.startsWith("Vi"));
//        System.out.println(str.endsWith("mara"));
//        System.out.println(str.indexOf('a'));
//        System.out.println(str.charAt(4));
//        System.out.println(str.equals(str2));
//        System.out.println(str2.equalsIgnoreCase(str1));
//        System.out.println(str.length());
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.isBlank());
    }
}
