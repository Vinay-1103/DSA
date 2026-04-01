package com.vinay.basics.Stacks;

public class StackUsingArray {
    protected int[] stackArray;
    protected int top;
    protected int maxsize;

    public StackUsingArray(int size){
        maxsize=size;
        stackArray = new int[size];
        top=-1;
    }

    public void push(int element){
        if (isFull()){
            resize();
//            System.out.println("Can not insert because stack is full ");
//            return;
        }
        top++;
        stackArray[top]=element;
    }
    boolean isFull(){
        if (top==stackArray.length-1){
            return true;
        }
        return false;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Can not pop because Stack is empty");
        }
        int x =stackArray[top];
        top--;
        return x;
    }
    boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }

    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not peek because stack is empty");
        }
        int x=stackArray[top];
        return x;
    }

    public void resize(){
        maxsize=maxsize*2;
        int[] newArray = new int[maxsize];
        for (int i=0;i<stackArray.length;i++){
            newArray[i]=stackArray[i];
        }
        stackArray=newArray;
    }
}
