package com.demo;

public class Arithmetic {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Addition of 5 and 10 is "+arithmetic.add(5,10));
        System.out.println("Subtraction of 10,5 is "+arithmetic.sub(10,5));
        System.out.println("Multiplication of 10,5 is "+arithmetic.multiply(10,5));
        System.out.println("Divition of 10,5 is "+arithmetic.divide(10,5));
    }
}
