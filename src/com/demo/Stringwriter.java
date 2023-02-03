package com.demo;
import java.io.IOException;
import java.io.StringWriter;
public class Stringwriter {
    public static void main(String[] args) {

        String str = "This is test string for stringwriter";

        StringWriter output = new StringWriter();
        output.write(str);

        System.out.println(output.toString());
    }
}
