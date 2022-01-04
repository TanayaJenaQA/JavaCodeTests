package com.code.practice;

import java.util.Scanner;

public class FactorialWithRecursion {

	public static void main(String[] args) {

		System.out.println("Enter one Number ");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		FactorialWithRecursion fRecursion = new FactorialWithRecursion();
		System.out.println(fRecursion.factorial(x));

	}

	public long factorial(int n) {
		if (n < 0) {
			return -9999;
		}
		if (n == 1) {
			return n;
		}
		System.out.println(n);		
		return n * factorial(n - 1);
	}

}
