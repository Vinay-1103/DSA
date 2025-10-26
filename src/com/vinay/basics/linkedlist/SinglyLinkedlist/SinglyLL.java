package com.vinay.basics.linkedlist.SinglyLinkedlist;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;


    void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

        if(tail==null){
            tail=newNode;
        }
        size++;
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if (head==null){
            insertAtBeginning(data);
            return;
        }
       /* tail.next=newNode;
        tail=newNode;
        size++;*/
        Node temp;
        temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }

    void insertAtPosition(int data,int pos){
        Node newNode=new Node(data);
        if (head==null){
            if (pos==1){
                insertAtBeginning(data);
            }
        }
        if (pos==1){
            newNode.next=head;
            head=newNode;
            size++;
        }
        if (pos<=0 || pos>size+1){
            System.out.println("Position is not valid");
            return;
        }
        int currPosition=1;
        Node temp;
        temp=head;
        while (currPosition<pos-1){
            temp=temp.next;
            currPosition++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    void insertAfterValue(int data,int value){
        Node newNode= new Node(data);
        Node temp;
        temp=head;
        while ((temp!=null) && (temp.data!=value)){
            temp=temp.next;
        }
        if (temp!=null){
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }else {
            System.out.println("No such Value exist");
        }

    }

    void deleteAtBegining(){

        if (head == null){
            System.out.println("Can not delete because list is empty");
            return;
        }
        System.out.println("Delete node is : "+head.data);
        head=head.next;
        size--;
        if (head==null){
            tail=null;
        }
    }

    void deleteAtEnd(){
        if (head == null){
            System.out.println("Can not delete because list is empty");
            return;
        }
        if (head.next==null){
            head=null;
            tail=null;
            size--;
        }

        Node temp;
        temp=head;
        while (temp.next.next != null){
            temp=temp.next;
        }
        System.out.println("Delete node is : "+head.data);
        temp.next=temp.next.next;
        size--;
    }

    void deleteAtPosition(int pos){
        if (head == null){
            System.out.println("Can not delete because list is empty");
            return;
        }
        if(pos==1){
            deleteAtBegining();
            return;
        }
       /* if(pos<=0 || pos>size){
            System.out.println("Invalid Position");
            return;
        }
        int currPosition =1;
        Node temp;
        temp=head;
        while (currPosition<pos-1){
            temp=temp.next;
            currPosition++;
        }
        System.out.println("Delete node is : "+temp.next.data);
        temp.next=temp.next.next;
        size--;
        */
        int currPosition=1;
        Node temp;
        temp=head;
        Node preNode=null;
        while (temp!=null){
            if (currPosition==pos){
                int val= temp.data;;
                preNode.next=temp.next;
                System.out.println("Deleted Node : "+val);
                size--;
                return;
            }
            preNode=temp;
            temp=temp.next;
            currPosition++;
        }
    }

    void deleteValue(int value){
        if (head == null){
            System.out.println("Can not delete because list is empty");
            return;
        }
        if (head.data==value){
            System.out.println("Deleted node : "+head.data);
            head=head.next;
            size--;
        }
        Node temp,prevNode;
        prevNode=null;
        temp=head;
        while ((temp!=null) && (temp.data!=value)){
            prevNode=temp;
            temp=temp.next;
        }
        if (temp!=null){
            System.out.println("Deleted node is "+temp.data);
            prevNode.next=temp.next;
            size--;
        }else {
            System.out.println("No value in list");
        }
    }

    void traversalLinkedlist(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp;
        temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("End");
//        System.out.println(size);
    }

    void findLength(){
        Node temp;
        temp=head;
        int count=0;
        while (temp != null){
            count++;
            temp=temp.next;
        }
        System.out.println("Length of Linked List is : "+count);
    }

    boolean searchLL(int value){
        Node temp;
        temp=head;
        while (temp != null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    void reverseLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            System.out.println("Only one element in linked list");
            System.out.println(head.data);
            return;
        }
        Node temp,prevNode,nextNode;
        temp=head;
        prevNode=null;
        while (temp != null){
            nextNode=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=nextNode;
        }
        head=prevNode;
    }

    public static void main(String[] args) {
        SinglyLL obj=new SinglyLL();
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(25);
        obj.insertAtBeginning(34);
        obj.insertAtBeginning(1);
        obj.insertAtEnd(94);
        obj.insertAtPosition(64,5);
        obj.insertAfterValue(99,94);
        obj.traversalLinkedlist();
        obj.reverseLL();
        obj.traversalLinkedlist();
//        obj.findLength();
//        System.out.println(obj.searchLL(99));
//        obj.deleteAtBegining();
//        obj.deleteAtEnd();
//        obj.deleteAtPosition(3);
//        obj.deleteValue(94);
//        obj.traversalLinkedlist();


    }
}
