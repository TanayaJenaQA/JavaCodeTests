package com.code.practice;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int x = sc.nextInt();
		sc.close();
		int count = 0;
		if (x == 0 || x == 1) {
			System.out.println(x + " is not prime");
		} else {
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println(x + " is prime");
			} else {
				System.out.println(x + " is not prime");
			}
		}

	}

}
