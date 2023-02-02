package com.demo;

public class Prime {

    public static void main(String[] args)
    {
        int num=2,count=0,i;

        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("\nIt is a Prime Number.");
        else
            System.out.println("\nIt is not a Prime Number.");
    }
}
