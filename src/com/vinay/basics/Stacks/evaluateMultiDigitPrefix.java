package com.vinay.basics.Stacks;

import java.util.Stack;

public class evaluateMultiDigitPrefix {
    static int evaluatePrefixwithMultiDigit(char[] expr){
        Stack<Integer> stack=new Stack<>();
        int i=expr.length-1;
        while (i>=0){
            if (expr[i] == ' '){
                i--;
                continue;
            }
            char ch=expr[i];
            if (isOperator(ch)){
                int op1 = stack.pop();
                int op2 = stack.pop();
                int updateop = compute(ch,op1,op2);
                stack.push(updateop);
                i--;
            } else if (Character.isDigit(ch)) {
                StringBuilder num = new StringBuilder();
                while (i>0 && Character.isDigit(expr[i])){
                    num.insert(0,expr[i]);
                    i--;
                }
                stack.push(Integer.parseInt(num.toString()));
            }
            else {
                throw new IllegalArgumentException("Invalid Character :"+ch);
            }
        }
        return stack.pop();
    }
    static boolean isOperator(char op){
        return op == '+' || op == '-' || op == '*' ||op == '/';
    }

    static int compute(char ch ,int op1 ,int op2){
        switch (ch){
            case '+':return op1+op2;
            case '-':return op1-op2;
            case '*':return op1*op2;
            case '/':return op1/op2;
            case '^':return(int) Math.pow(op1,op2);
            default:throw new IllegalArgumentException("Invalid Operator :"+ch);
        }
    }


    public static void main(String[] args) {
        String exp="+ 2 * 5 4";
        char[] expchars=exp.toCharArray();
        int result=evaluatePrefixwithMultiDigit(expchars);
        System.out.println(result);
    }
}
