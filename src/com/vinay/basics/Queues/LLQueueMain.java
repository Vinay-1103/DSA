package com.vinay.basics.Queues;

public class LLQueueMain {
    public static void main(String[] args) {
        try {
        LLQueueUsing queue = new LLQueueUsing();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Removed element :"+queue.dequeue());
        queue.display();
            System.out.println(queue.peek());
    }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
