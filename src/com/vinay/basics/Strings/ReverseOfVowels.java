package com.vinay.basics.Strings;

public class ReverseOfVowels {
        public static String reverseVowels(String s) {
            char[] arr = s.toCharArray();
            int left = 0 ,right = arr.length-1;
            while(left<right){
                char leftChar = arr[left];
                char rightChar = arr[right];

                if("aeiouAEIOU".indexOf(leftChar) == -1){
                    left++;
                }
                else if ("aeiouAEIOU".indexOf(rightChar) == -1){
                    right--;
                }
                else{
                    arr[left] = rightChar;
                    arr[right] = leftChar;
                    left++;
                    right--;
                }

            }
            return new String(arr);

        }

    public static void main(String[] args) {
            String s="IceCreAm";
        System.out.println(reverseVowels(s));

    }
}

