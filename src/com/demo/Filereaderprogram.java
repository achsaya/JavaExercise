package com.demo;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereaderprogram {
    public static void main(String args[])throws Exception {
        try {
            FileReader fr = new FileReader("src/com/demo/test.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();

        } catch (FileNotFoundException fe) {
            System.out.println("File not found " + fe.getMessage());
        } catch (IOException ie) {
            System.out.println("Exception " + ie.getMessage());
        }
    }
}
