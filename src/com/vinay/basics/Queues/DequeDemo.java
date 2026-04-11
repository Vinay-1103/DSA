package com.vinay.basics.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(100);
        deque.addFirst(20);
        deque.addLast(30);
        System.out.println(deque);
        deque.addAll(list);
        System.out.println(deque);
    }
}
