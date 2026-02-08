package com.vinay.basics.linkedlist.leetcode;

public class ConvertToLL {
    Node head;
    Node convertLinkedList(int[] arr){
     head = new Node(arr[0]);

     Node temp=head;
     for (int i =1;i<arr.length;i++){
         Node newNode = new Node(arr[i]);
         temp.next=newNode;
         temp=newNode;
     }
     return head;
    }

    void traversalLinkedlist(Node head){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp;
        temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }

    }

    public static void main(String[] args) {
        int arr[]={40,2,62,34,18};
        Node head;
        ConvertToLL obj=new ConvertToLL();
        head=obj.convertLinkedList(arr);
        obj.traversalLinkedlist(head);
    }
}
