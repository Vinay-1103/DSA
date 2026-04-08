package com.vinay.basics.Queues;

public class ArrayQueueTwoPointers {
    private int[] queue;
    int size;
    int front , rear ;
    public ArrayQueueTwoPointers(int size){
        this.size=size;
        front=-1;
        rear=-1;
        this.queue=new int[size];
    }

    public void enqueue(int x){
        if (isFull()){
            System.out.println("Queue is full , cannot insert more elements");
            return;
        }
        rear++;
        queue[rear]=x;
        if (front == -1){
            front++;
        }
    }
    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty , Cannot remove ");
            return -1;
        }
        if (front == rear){
            int removeElement = queue[front];
            front=-1 ;
            rear = -1;
            return removeElement;
        }
        int removeElement = queue[front];
        front++;
        return removeElement;
    }

    public boolean isEmpty(){
        return rear == -1 || front>rear;
    }

    public boolean isFull(){
        return rear == queue.length-1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

}
