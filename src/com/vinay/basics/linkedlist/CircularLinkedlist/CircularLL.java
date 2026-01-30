package com.vinay.basics.linkedlist.CircularLinkedlist;

public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    Node insertAtBeginning(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            head.next=head;
            size++;
            return head;
        }
//        Case 1 : we have both head and tail
        /*tail.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
        return head;*/

//        case 2 :we have only head
       Node temp = head;
        do {
            temp = temp.next;
        }while (temp.next != head);
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
        size++;
        return head;

//        case 3 : we have only tail
     /*   newNode.next=tail.next;
        tail.next=newNode;
        size++;
        return tail;*/
    }
    Node insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            head.next=head;
            size++;
            return head;
        }
//        case 1 :we have both head and tail
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
        size++;
        return head;
    }
    Node insertAtPosition(int data ,int pos){
        Node newNode = new Node(data);
        if (pos<=0){
            System.out.println("Position is not vaild .so can not insert");
            return head;
        }
        if (pos==1){
            return insertAtBeginning(data);
        }
        Node temp,prevNode;
        temp=head;
        prevNode=null;
        int currPos=1;
        do {
            if (currPos==pos){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            currPos++;
        }while (temp!=head);
        if (temp == head){
            System.out.println("Position is not valid");
            return head;
        }
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        size++;
        return head;
    }
    Node insertAfterValue(int data ,int value){
        Node newNode=new Node(data);
        if (head==null){
            System.out.println("No such value exist");
            return head;
        }
        if (head.data==value){
            newNode.next=head.next;
            head.next=newNode;
            size++;
            return head;
        }
        Node temp;
        temp=head;
        do {
            if (temp.data==value){
                break;
            }
            temp=temp.next;
        }while (temp!=head);

        if (temp==head){
            System.out.println("Mo such value exist");
            return head;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
        return head;
    }

    Node deleteFromHead(Node head){
        if (head==null){
            System.out.println("List is empty so can not delete");
            return head;
        }
        if (head.next == head){
            head.next=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
//        1.Case with head and tail
//        Node temp=head;
        tail.next=head.next;
        head.next=null;
        head=tail.next;
        size--;
        return head;

//        Case 2 :when we have only head
        /*Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head.next=null;
        head=temp.next;
        size--;
        return head;*/

//        Case 3 :only we have tail
     /*   Node temp=tail.next;
        tail.next=temp.next;
        temp.next=null;
        return tail;*/
    }

    Node deleteFromEnd(Node head){
        if (head == null){
            System.out.println("List is empty so can not delete");
            return head;
        }
        if (head.next==head){
            head.next=null;
            head=null;
            tail=null;
            size--;
            return head;
        }
//        Case 1:Both head and tail
        Node temp =head;
        Node prevNode=null;
        do {
            prevNode=temp;
            temp=temp.next;
        }while (temp.next!=head);
        prevNode.next=temp.next;
        tail=prevNode;
        temp.next=null;
        size--;
        return head;
    }
    void traverseCLL(Node head){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp != head);
        System.out.println();
    }


    public static void main(String[] args) {
        Node head =null;
        CircularLL cll =new CircularLL();
        head=cll.insertAtBeginning(45);
        head=cll.insertAtBeginning(50);
        head=cll.insertAtBeginning(64);
        head=cll.insertAtEnd(90);
        cll.traverseCLL(head);
//        head=cll.insertAtPosition(12,5);
        head = cll.insertAfterValue(66,50);
        cll.traverseCLL(head);
//        head=cll.deleteFromHead(head);
        head=cll.deleteFromEnd(head);
        cll.traverseCLL(head);
    }
}
