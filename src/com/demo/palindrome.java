package com.demo;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        String str, strReverse="";
        char ch;
        int i, strLen;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = scan.nextLine();

        strLen = str.length();
        i = (strLen-1);
        while(i>=0)
        {
            ch = str.charAt(i);
            strReverse = strReverse + ch;
            i--;
        }

        if(str.equals(strReverse))
            System.out.println("\n\"" +str+ "\" is a Palindrome String.");
        else
            System.out.println("\n\"" +str+ "\" is not a Palindrome String.");
    }
}
