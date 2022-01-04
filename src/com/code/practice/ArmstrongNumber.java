package com.code.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int x = 1635;
		int length = String.valueOf(x).length();
		int temp = x;
		int r = 1;
		int result = 0;

		while (x > 0) {
			r = x % 10;
			x = x / 10;
			int val = 0;
//			for (int i = 0; i < length; i++) {
//				val = val * r;
//			}
			
			result = result +(int) Math.pow(r, length);
		}
		System.out.println(result);
		if (temp == result) {
			System.out.println("Number is Armstrong number");
		}
		else {
			System.out.println("Number is not Armstrong number");
		}
	}

}
