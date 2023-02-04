package com.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        try {


            List arrlist = new ArrayList<String>();
            arrlist.add("Hello");
            arrlist.add("Achu");
            arrlist.add("kavin");
            arrlist.add("kaviya");
            arrlist.add("sushmi");
            arrlist.add("deiva");
            List secondArrlist = new ArrayList();
            secondArrlist.addAll(arrlist);
            System.out.println("Second arraylist: "+secondArrlist.size());
            secondArrlist.add("newitem");
            System.out.println("Content of second array list: "+secondArrlist);
            System.out.println("Secondarraylist contains all: "+secondArrlist.containsAll(arrlist));

            System.out.println(arrlist);
            System.out.println(arrlist.size());
            System.out.println((arrlist.contains("Hello")) ? "true" : "false");
            arrlist.remove("Hello");
            System.out.println(arrlist.size());
            System.out.println((arrlist.contains("Hello")) ? "true" : "false");

            System.out.println(arrlist.get(0));
            /*System.out.println(arrlist.get(8));*/
            System.out.println(arrlist.isEmpty());
            arrlist.clear();
            System.out.println("Post clearing the arrlist: "+(arrlist.size()));


        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Index out of bound" + ie.getMessage());
        }
        System.out.println("Executed Successfully");

    }
}
