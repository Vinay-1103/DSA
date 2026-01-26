package com.vinay.basics.Strings;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Welcome to my codingTime123 ";
        String longestWord ="";
        sentence=sentence+" ";
        /*String[] words = sentence.split(" ");
        for (String word:words){
            if (word.length()>longestWord.length()){
                longestWord=word;
            }
        }*/
        String word="";
        for(int i =0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (word.length()>longestWord.length()){
                    longestWord=word;
                }
                word="";
            }
        }
        System.out.println(longestWord);
    }
}
