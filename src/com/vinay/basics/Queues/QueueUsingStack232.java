package com.vinay.basics.Queues;

import java.util.Stack;

public class QueueUsingStack232 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int x){
        if (stack1.empty()){
            stack1.push(x);
            return;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    public int dequeue(){
        return stack1.pop();
    }
    public int front(){
        return stack1.peek();
    }

    public boolean empty(){
        return stack1.isEmpty();
    }


    public static void main(String[] args) {
        QueueUsingStack232 queue = new QueueUsingStack232();
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println("Removed element "+queue.dequeue());
    }
}
