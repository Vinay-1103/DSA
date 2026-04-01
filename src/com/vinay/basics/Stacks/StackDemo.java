package com.vinay.basics.Stacks;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.empty());

        System.out.println(stack);

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
