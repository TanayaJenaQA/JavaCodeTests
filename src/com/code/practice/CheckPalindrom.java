package com.code.practice;

import java.util.Scanner;

public class CheckPalindrom {

	public static void main(String[] args) {
		System.out.println("Enter one Number ");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int temp = x;
		int newVal = 0;
		int reminder = 0;
		while (x > 0) {
			reminder = x % 10;
			newVal = (newVal * 10) + reminder;
			x = x / 10;
		}
		System.out.println(newVal);
		if (newVal == temp) {
			System.out.println("Number is palindrom");
		} else {
			System.out.println("Number is not palindrom");
		}
		sc.close();

	}

}
