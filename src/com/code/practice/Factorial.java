package com.code.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter one Number ");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int value = 1;
		for (int i = 1; i <= x; i++) {
			value = value * i;
		}
		System.out.println("Vaue " + value);
		sc.close();

	}
	

}
