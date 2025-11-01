package com.vinay.basics.linkedlist.DoubleLinkedlist;


public class DoubleLL {
    private Node head;
    private Node tail;
    private int size;

    Node insertAtBeginning(int data){
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }

    Node insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }

       /* //case 1: with tail
        tail.next=newNode;
        newNode.prev=tail;
        size++;
        return head;*/

        Node temp;
        temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        return head;
    }
    void traversalLL(Node head){
        if (head==null){
            System.out.println("List is empty");
        }else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        System.out.println( );
        }
    }

    Node insertAtPosition(int data,int pos){
        Node newNode = new Node(data);
        if (pos <= 0){
            System.out.println("Position not Valid");
        }
        if (pos == 1){
            return insertAtBeginning(data);
        }
        Node temp=head;
        int currPos=1;
        while (temp != null){
            if (currPos==pos){
                break;
            }
            temp=temp.next;
            currPos++;
        }
        if(temp == null) {
            System.out.println("Position not valid");
            return head;
        }
        Node prevNode=temp.prev;
        newNode.next=temp;
        newNode.prev=prevNode;
        prevNode.next=newNode;
        temp.prev=newNode;
        size++;
        return head;
    }
    Node insertAfterValue(int data,int val){
        if (head == null){
            System.out.println("No such value ,so cannot exit");
            return head;
        }
        Node newNode = new Node(data);
        Node temp=head;
        while ((temp != null) && (temp.data!=val)){
            temp=temp.next;
        }
        if (temp == null ){
            System.out.println("Value not found so can`t insert");
            return head;
        }
        Node nextNode=temp.next;
        newNode.prev=temp;
        newNode.next=nextNode;
        temp.next=newNode;
        if (nextNode != null){
            nextNode.prev=newNode;
        }
        size++;
        return head;
    }

    void reverseTraverse(Node head){
            Node temp = head;
        if (head == null){
            System.out.println("List is empty");
            return;

        }
            while (temp.next != null) {
                temp = temp.next;
            }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

    }

    public static void main(String[] args) {
        DoubleLL obj=new DoubleLL();
        Node head;
        head=obj.insertAtBeginning(100);
        head=obj.insertAtBeginning(156);
        head=obj.insertAtEnd(697);
        head=obj.insertAtBeginning(644);
//        head=obj.insertAtPosition(456,2);
//        head=obj.insertAfterValue(243,697);
        obj.traversalLL(head);
        obj.reverseTraverse(head);
    }
}
