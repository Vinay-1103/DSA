package com.vinay.basics.Stacks;

import java.util.Stack;

public class prefixToinfix {
    static String PrefixtoInfix(String exp){
        Stack<String> stack = new Stack<>();
        for (int i =exp.length()-1 ; i>=0 ;i--){
            char ch =exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch+"");
            }
            else {
                String oper1 = stack.pop();
                String oper2 = stack.pop();
                String updOperand = "("+oper1+ch+oper2+")";
                stack.push(updOperand);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp="*+ab/ef";
        String infix = PrefixtoInfix(exp);
        System.out.println(infix);
    }
}
