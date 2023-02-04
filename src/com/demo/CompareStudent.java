package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student1 implements Comparable<Student1> {
    int rollno;
    String name;
    int age;
    Student1(int rollno,String name,int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;

    }
    public int compareTo(Student1 st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;

    }

}
public class CompareStudent{
    public static void main(String[] args) {
        ArrayList<Student1> al = new ArrayList<Student1>();
        al.add(new Student1(101,"Vijay",22));
        al.add(new Student1(106,"Ajay",21));
        al.add(new Student1(103,"Jay",27));

        Collections.sort(al);
        for (Student1 st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
