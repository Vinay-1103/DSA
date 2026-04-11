package com.vinay.basics.Queues;

public class DequeUsingCircularArray {
    int[] deque;
    int front , rear ;
    int size ;
    public DequeUsingCircularArray(int size){
        this.size=size;
        this.deque = new  int[size];
        this.front = -1 ;
        this.rear = -1 ;
        System.out.println("Deque has been created of size "+this.size);
    }

    void addFront(int x) throws  Exception{
        if (isFull()) throw new Exception("cannot add because deque is full");
        if (front == -1){
            front = 0;
            rear = 0;
            deque[front]=x;
        }
        else if (front == 0){
            front = size-1;
            deque[front] = x;
        }
        else {
            front-- ;
        }
        deque[front] = x;
    }

    boolean isFull(){
        return (rear+1 == front || (front == 0 && rear == size-1));
    }

    boolean isEmpty(){
        return front == -1 ;
    }

    void display() throws  Exception{
        if (isEmpty()) {
            throw new Exception("Cannot display Deque is empty");
        }
        int i = front;
        while (i != rear){
            System.out.print(deque[i]+" ");
            i = (i+1)%size;
        }
        System.out.println(deque[rear]);
    }

    void addRear(int x) throws  Exception{
        if (isFull()) throw new Exception("cannot add because deque is full");
        if (front == -1){
            front = 0;
            rear = 0;
            deque[front]=x;
        } else if (rear == size-1) {
            rear = 0;
        }
        else {
            rear++;
        }
        deque[rear]=x;
    }

    int deleteFront()throws  Exception{
            if (isEmpty()) {
                throw new Exception("Cannot display Deque is empty");
            }
            int removeElement = deque[front];
            if (front == rear){
                front = -1;
                rear = -1 ;
            } else if (front == size-1) {
                front=0;
            }else {
                front++;
            }
            return removeElement;
    }

    int deleteRear()throws  Exception{
        if (isEmpty()) {
            throw new Exception("Cannot display Deque is empty");
        }
        int removeElement = deque[rear];
        if (front == rear){
            front = -1;
            rear = -1 ;
        } else if (rear == 0) {
            rear = size-1;
        }else {
            rear--;
        }
        return removeElement;
    }

    int getFront()throws  Exception{
            if (isEmpty()) {
                throw new Exception("Cannot display Deque is empty");
            }
            return deque[front];
    }
    int getRear()throws  Exception{
        if (isEmpty()) {
            throw new Exception("Cannot display Deque is empty");
        }
        return deque[rear];
    }

    public static void main(String[] args) {
        try {
            DequeUsingCircularArray deque = new DequeUsingCircularArray(3);
            deque.addFront(10);
            deque.addRear(60);
            deque.addRear(50);
//            System.out.println("Deleted element is :"+deque.deleteFront());
            deque.display();
            System.out.println("Front element is :"+deque.getFront());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
