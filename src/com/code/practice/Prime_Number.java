package com.code.practice;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int x = sc.nextInt();
		boolean flag = false;
		int temp = x / 2;

		if (x == 0 || x == 1) {
			System.out.println(x + " is not prime number");
		} else {
			for (int i = 2; i <= temp; i++) {
				if (x % i == 0) {
					System.out.println(x + " is not prime number");
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(x + " is  prime number");
			}
		}
		sc.close();

	}

}
