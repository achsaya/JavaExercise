package com.demo;
import java.io.StringReader;
import java.io.IOException;
public class Stringreader {


        public static void main(String[] args) {

            String data = "This is the text for StringReader.";


            char[] array = new char[50];

            try {

                StringReader input = new StringReader(data);

                //Use the read method
                input.read(array);
                System.out.println("Data read from the string:");
                System.out.println(array);

                input.close();
            }
            catch(IOException e) {
                System.out.println(e);
            }
        }
    }
