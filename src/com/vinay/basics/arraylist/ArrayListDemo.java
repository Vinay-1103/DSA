package com.vinay.basics.arraylist;


import java.util.ArrayList;

public class ArrayListDemo {
//Without Generics
/*    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(15);
        list.add("Vinay");

        String name=(String) list.get(2);
        System.out.println(name);

        System.out.println(list);
    }*/

//    With Generics
public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    list.add("vinay");

    System.out.println(list);
}

}
