package com.code.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

//		0,1,1,2,3,5,8,13,21

		System.out.println(" Enter a  Value : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int val1 = 0;
		int val2 = 1;
		int total = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(val1 + ",");
			val1 = val2;
			val2 = total;
			total = val1 + val2;

		}
		sc.close();

	}

}
