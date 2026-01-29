package com.vinay.basics.linkedlist.SinglyLinkedlist;

public class PracticeSLL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;

        if(tail == null){
            tail=newNode;
        }
        size++;
    }
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            insertAtBegin(data);
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;

       /* Node temp;
        temp= head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;*/
    }

    void insertAtPosition(int data , int pos){
        Node newNode = new Node(data);
        if (head == null){
            if(pos == 1){
                insertAtBegin(data);
            }
        }
        if (pos == 1){
            newNode.next=head;
            head =newNode;
            size++;
        }
        if (pos<=0 || pos>size+1){
            System.out.println("Invalid position");
        }
    }

    void printLL(){
        if (head==null){
            System.out.println("List is empty ");
            return;
        }
        Node temp;
        temp = head;
        while (temp!= null){
            System.out.print(temp.data+ "-->");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println(size);
    }

    public static void main(String[] args) {
        PracticeSLL obj = new PracticeSLL();
        obj.insertAtBegin(45);
        obj.insertAtBegin(546);
        obj.insertAtEnd(400);
        obj.printLL();
    }
}
