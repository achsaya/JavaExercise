package com.demo;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Bufferoutput {
    public static void main(String args[]){
        try {
            FileOutputStream fout = new FileOutputStream("src/com/demo/test2");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Buffer output stream execution.";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
