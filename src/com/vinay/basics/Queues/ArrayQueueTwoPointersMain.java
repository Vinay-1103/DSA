package com.vinay.basics.Queues;

public class ArrayQueueTwoPointersMain {
    public static void main(String[] args) {
        ArrayQueueTwoPointers queue = new ArrayQueueTwoPointers(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        queue.display();
        queue.enqueue(60);
        System.out.println(queue.peek());
    }
}
