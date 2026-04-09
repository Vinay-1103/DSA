package com.vinay.basics.Queues;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueueUsingArray cQueue = new CircularQueueUsingArray(5);
        cQueue.enqueue(10);
        cQueue.enqueue(20);
        cQueue.enqueue(30);
        cQueue.display();
        System.out.println("Removed Element is :"+cQueue.dequeue());
        cQueue.display();
    }
}
