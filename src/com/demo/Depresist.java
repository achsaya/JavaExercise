package com.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depresist {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("src/com/demo/f.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            Student s = (Student)in.readObject();

            System.out.println(s.id+" "+s.name);

            in.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
