package com.vinay.basics.Stacks;

import java.util.Map;
import java.util.Stack;

public class evaluatePrefix {
    static int evaluatePrifix(String exp){
        Stack<Integer> stack = new Stack<>();
        for (int i = exp.length()-1;i>=0;i--) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                int updateop = compute(ch,op1,op2);
                stack.push(updateop);
            }
        }
        return stack.pop();
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
        String exp="+2*54";
        int result=evaluatePrifix(exp);
        System.out.println(result);
    }
}
