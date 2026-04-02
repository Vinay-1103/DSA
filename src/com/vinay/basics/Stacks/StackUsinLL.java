package com.vinay.basics.Stacks;

public class StackUsinLL {
    private Node top;
    public StackUsinLL(){
        this.top=null;
    }
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top=newNode;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop because list is Empty");
        }
        int x =top.data;
        top=top.next;
        return x;
    }
    boolean isEmpty(){
        return top==null;
    }
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop because list is Empty");
        }
        int x =top.data;
        return x;
    }



    public static void main(String[] args) {
        try {

       StackUsinLL stack=new StackUsinLL();
       stack.push(10);
        stack.push(12);
        stack.push(60);

        System.out.println(stack.pop());
            System.out.println(stack.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
