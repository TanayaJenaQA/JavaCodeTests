package com.code.practice;

import java.util.Scanner;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One String");
		String data = sc.next();
		char[] newData = data.toCharArray();
		
		

		for (int i = newData.length-1; i >= 0; i--) {
           System.out.print(newData[i]);
		}
		sc.close();

	}

}
