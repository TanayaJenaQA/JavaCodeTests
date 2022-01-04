package com.code.practice;

public class ReverseNumberUsingRecursion {
	static int reminder = 0;
	static int newValue = 0;

	public static void main(String[] args) {
		System.out.print("The reverse of the given number is: " + reverseNumber(123245));
	}

	public static int reverseNumber(int number) {
		if (number < 1)
			return number;
		else {
			reminder = (number % 10);
			newValue = (newValue * 10) + reminder;
			reverseNumber(number / 10);
		}
		return newValue;
	}

}
