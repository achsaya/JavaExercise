package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        try{
            LinkedList linklist = new LinkedList<String>();
            linklist.add("never");
            linklist.add("ever");
            linklist.add("give");
            linklist.add("up");

            ListIterator list_it = linklist.listIterator(1);
            while(list_it.hasNext())
                System.out.print(list_it.next()+" ");
            System.out.println(" ");
            while(list_it.hasPrevious())
                System.out.print(list_it.previous()+" ");
            System.out.println(" ");
            for(int i=0;i< linklist.size();i++){
                System.out.println(linklist.get(i));
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
