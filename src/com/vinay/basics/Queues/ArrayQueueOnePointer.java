package com.vinay.basics.Queues;

public class ArrayQueueOnePointer {
    private int[] queue;
    int size;
    int rear ;
    public ArrayQueueOnePointer(int size){
        this.size=size;
        rear=-1;
        this.queue=new int[size];
    }
    public void enqueue(int x){
        if (isFull()){
            System.out.println("Queue is full , cannot insert more elements");
            return;
        }
        queue[++rear]=x;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty , Cannot remove ");
            return -1;
        }
        int removeElement = queue[0];
        for (int i =1;i<=rear;i++){
            queue[i-1] = queue[i];
        }
        rear--;
        return removeElement;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[0];
    }
    public boolean isEmpty(){
        return rear == -1 ;
    }

    public boolean isFull(){
        return rear == queue.length-1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }
}
