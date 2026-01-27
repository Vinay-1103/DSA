package com.vinay.basics.collectionInter;

import com.vinay.basics.arrays.LinearSearchalgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,45,5));
//        for (Integer integer : list) {
//            if (integer == 1){
//                list.remove(1);
//            }
//            System.out.println(integer);
//        }

        ListIterator<Integer> it =list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
            if (it.next() == 2){
                it.add(34);
                it.next();
                it.remove();
            }
        }
        System.out.println(list);
//
//        Iterator<Integer> itr=list.iterator();
//        for (Iterator<Integer> itr=list.iterator();itr.hasNext();){
//            int num= itr.next();
//            if (num==3){
//                itr.remove();
//            }
//        }
//        System.out.println(list);

//        while (itr.hasNext()){
//            int num = itr.next();
//            System.out.println(num);
//        }

//        for (int num: list){
//            if (num == 3){
//                list.set(list.indexOf(3),30);
//            }
//        }
//        System.out.println(list);
    }
}
