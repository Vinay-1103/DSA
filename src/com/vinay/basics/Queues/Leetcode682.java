package com.vinay.basics.Queues;

import java.util.Stack;

public class Leetcode682 {

        public static int calPoints(String[] operations) {
            Stack<Integer> stack = new Stack<>();
            for(String op : operations){
                if(op.equals("+")){
                    int x = stack.pop();
                    int newScore = x+stack.peek();
                    stack.push(x);
                    stack.push(newScore);
                }
                else if (op.equals("C")){
                    stack.pop();
                }
                else if(op.equals("D")){
                    stack.push(2*stack.peek());
                }
                else{
                    stack.push(Integer.parseInt(op));
                }
            }
            int total = 0;
            for(int score : stack){
                total += score;
            }
            return total;
        }

    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};

        int result = calPoints(operations);
        System.out.println(result);

    }
    }

