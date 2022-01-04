package com.code.practice;

public class PrimeNumberFrom1to100 {

	public static void main(String[] args) {

		boolean flag = false;

		for (int i = 1; i <= 100; i++) {
			int count = 0;

			if (i == 0 || i == 1) {
				System.out.println(i + " is not prime");

			} else {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println(i + " is prime");
				} else {
					System.out.println(i + " is not prime");
				}

			}

		}

	}
}
