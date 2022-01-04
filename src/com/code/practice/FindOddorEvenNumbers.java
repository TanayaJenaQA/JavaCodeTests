package com.code.practice;

import java.util.Scanner;

public class FindOddorEvenNumbers {

	public static void main(String[] args) {
		System.out.println(" Enter a  Value : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		} else if (num % 2 != 0) {
			System.out.println(num + " is Odd");
		}
		sc.close();
	}

}
