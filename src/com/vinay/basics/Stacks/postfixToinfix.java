package com.vinay.basics.Stacks;

import java.util.Stack;

public class postfixToinfix {
    static String PostfixtoInfix(String exp){
        Stack<String> stack = new Stack<>();
        for (char ch : exp.toCharArray()){
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch+"");
            }
            else {
                String oper1 = stack.pop();
                String oper2 = stack.pop();
                String updOperand = "("+oper2+ch+oper1+")";
                stack.push(updOperand);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp="ab+ef/+";
        String infix = PostfixtoInfix(exp);
        System.out.println(infix);
    }
}
