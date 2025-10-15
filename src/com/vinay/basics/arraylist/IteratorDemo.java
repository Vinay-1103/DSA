package com.vinay.basics.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,2,3,45,5));

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        ListIterator<Integer> it= list.listIterator();
        while (it.hasNext()){
            if(it.next()==2){
                it.remove();
                it.next();
                it.remove();
            }
        }
        System.out.println(list);
//         Iterator<Integer> itr= list.iterator();
//        while (itr.hasNext()){
//            int num=itr.next();
//            if (num==3){
//                itr.remove();
//
//            }
//            System.out.println(num);
//        }
//        System.out.println(list);

    }
}
