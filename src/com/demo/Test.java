package com.demo;

public class Test {
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );


        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
    }
}
