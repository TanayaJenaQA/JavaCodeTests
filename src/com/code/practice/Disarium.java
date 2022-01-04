package com.code.practice;

public class Disarium {

//	A Disarium number is a number defined by the following process:
//		Sum of its digits powered with their respective position is equal to the original number.
//		For example 175 is a Disarium number:
//		As 11+32+53 = 135

	public static void main(String[] args) {
		int num = 135;
		int temp = num, reminder = 0, sum = 0;
		String s = Integer.toString(num);
		int len = s.length();

		while (num > 0) {
			reminder = num % 10;
			sum = sum + (int) Math.pow(reminder, len);
			len--;
			num = num / 10;

		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println(" Valid");
		} else {
			System.out.println("invalid");
		}
	}

}
