package com.vinay.basics.Queues;

public class LLQueueUsing {
   Node front , rear ;
   public LLQueueUsing(){
       this.front=null;
       this.rear=null;
   }
   public void enqueue(int x){
       Node newNode = new Node(x);
       if (front == null){
           front = newNode;
           rear = newNode;
           return;
       }
       rear.next=newNode;
       rear = newNode;
   }

   public int dequeue() throws Exception{
       if (isEmpty()){
           throw new Exception("Queue is Empty ");
       }
       Node temp = front;
       front=front.next;

       if (front == null){
           rear = null;
       }
       return temp.data;
   }

   public int peek() throws Exception{
       if (isEmpty()) {

           throw new Exception("Queue is Empty Cannot peek");
       }
       return front.data;
   }
   public void display() throws  Exception{
       if (isEmpty()){
           throw new Exception("Queue is empty");
       }
       Node temp = front;
       while (temp != null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       System.out.println();
   }
   boolean isEmpty(){
       return front == null ;
   }
}
