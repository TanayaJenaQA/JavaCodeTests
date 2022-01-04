package com.code.practice;

import java.util.Scanner;

public class ReverseNumber {

//	Reverse a Number 
	public static void main(String[] args) {

		System.out.println("Enter  a number ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int reminder = 0;
		int newValue = 0;

		while (value > 0) {
			reminder = value % 10;
			newValue = (newValue * 10) + reminder;
			value = value / 10;
		}
		sc.close();
		System.out.println(newValue);

	}

}
