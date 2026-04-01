package com.vinay.basics.Stacks;

public class StackArrayMain {
    public static void main(String[] args) {
        try {

        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
