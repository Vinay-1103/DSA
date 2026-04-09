package com.vinay.basics.Queues;

public class CircularQueueUsingArray {
    private int[] queue;
    int size;
    int front , rear ;
    public CircularQueueUsingArray(int size){
        this.size=size;
        this.size=size;
        front=-1;
        rear=-1;
        this.queue=new int[size];
        System.out.println("Queue has been Created size of "+size);
    }

    public boolean enqueue(int x){
        if (isFull()){
            System.out.println("Queue is full , cannot insert more elements");
            return false;
        }
        if (front == -1 && rear == -1){
            front++;
            rear++;
            queue[rear]=x;
            return true;
        }
        rear = (rear+1)%size;
        queue[rear]=x;
        return true;
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
        front = (front+1)%size;
        return removeElement;
    }

    public boolean isEmpty(){
        return rear == -1 ;
    }

    public boolean isFull(){
        return ((rear+1)%size) == front;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (i != rear){
            System.out.print(queue[i] + " ");
            i=(i+1)%size;
        }
        System.out.println(queue[rear]);
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
}
