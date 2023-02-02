package com.demo;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Bufferinput {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("src/com/demo/test1");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
