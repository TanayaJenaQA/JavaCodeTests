package com.code.practice;

import java.util.Scanner;

public class ReverseString {
	
//	Reverse String using String buffer

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One String");
		String data = sc.next();
		StringBuffer stringbfr = new StringBuffer(data);
		System.out.println(stringbfr.reverse());
		sc.close();
		
	}

}
