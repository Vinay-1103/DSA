package com.vinay.basics.Stacks;

import java.util.Stack;

public class InfixToPrefix {
    static String reverseAndSwap(String exp){
        StringBuilder rev = new StringBuilder();
        for (int i=exp.length()-1;i>=0;i--){
            char ch  =exp.charAt(i);
            if (ch == '(') rev.append(')');
            else if (ch == ')') {
                rev.append('(');
            }else {
                rev.append(ch);
            }
        }
        return rev.toString();
    }

    static String infixTopostfix(String exp){
        StringBuilder output =new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : exp.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                output.append(c);
            } else if (c=='(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    output.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && stack.peek() != '(' && (precedence(c) < precedence(stack.peek())
                || precedence(c) == precedence(stack.peek()) && c == '^')){
                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            output.append(stack.pop());
        }
        return output.toString();
    }
    static int precedence(char op){
        return switch (op){
            case '^' ->3;
            case  '/' , '*' ->2;
            case  '+','-' ->1;
            default -> -1;
        };
    }

    static String infixToprefix(String infix){
        String revprefix = reverseAndSwap(infix);
        String postfix = infixTopostfix(revprefix);
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String expression = "a+b*c";
        String prefix = infixToprefix(expression);
        System.out.println("Prefix "+prefix);
    }
}
