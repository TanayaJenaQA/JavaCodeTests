package com.code.practice;

import java.util.Scanner;

public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One String");
		String data = sc.next();
		for (int i = data.length()-1; i >= 0; i--) {
			System.out.print(data.charAt(i));
		}
		sc.close();

	}

}
