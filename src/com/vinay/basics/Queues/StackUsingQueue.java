package com.vinay.basics.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    void push(int x){
        while (!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        queue1.add(x);
        while (!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }

    int pop() throws Exception{
        if (empty()) {
            throw new Exception("Cannot pop becoz queue is empty ");
        }
        return queue1.remove();
    }

    int top() throws Exception{
        if (empty()) {
            throw new Exception("Cannot peek becoz queue is empty ");
        }
        return queue1.peek();
    }

    boolean empty(){
        return queue1.isEmpty();
    }

    public static void main(String[] args)  {
        try {

        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
    }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
