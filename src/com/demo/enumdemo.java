package com.demo;

class Enumdemodeclare {
    enum EnumdemoSize{ SMALL, MEDIUM, LARGE }
    EnumdemoSize size;
}

public class enumdemo {

    public static void main(String args[]) {
        Enumdemodeclare enumdemo = new Enumdemodeclare();
        enumdemo.size = Enumdemodeclare.EnumdemoSize.MEDIUM ;
        System.out.println("Size: " + enumdemo.size);
    }
}
