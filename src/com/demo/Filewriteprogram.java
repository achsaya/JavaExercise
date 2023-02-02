package com.demo;
import java.io.FileWriter;
import java.io.IOException;



public class Filewriteprogram {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("src/com/demo/test3.txt");
            fw.write("File writer program");
            fw.close();
        }catch(IOException e){
            System.out.println(e);}
        System.out.println("Success...");
    }
}
