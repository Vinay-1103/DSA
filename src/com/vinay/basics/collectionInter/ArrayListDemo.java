package com.vinay.basics.collectionInter;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Without generics
        /*ArrayList list = new ArrayList();
        list.add(45);
        list.add("Vinay Kumar");
        list.add(45.5);

        System.out.println(list);*/

        //With Generices
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.addFirst(645);
        list.add(45);
        list.add(90);
        list.add(500);
//        int numm=list.get(0);
        list1.add(1);
        list1.add(2);

//        list.addAll(0,list1);
//        System.out.println(list);
//        list.removeAll(list1);
//        System.out.println(list);
//        list.retainAll(list1);
        System.out.println(list);
//        System.out.println(list1);
    }
}
