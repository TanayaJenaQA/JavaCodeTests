package com.code.practice;

public class DesignPatttern1 {

	public static void main(String[] args) {
 

        System.out.println("How many rows you want in this pattern?");        
        int value = 1;
         
        System.out.println("Here is your pattern :");
         
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+"\t");                 
                value++;
            }
             
            System.out.println();
        }

}}
