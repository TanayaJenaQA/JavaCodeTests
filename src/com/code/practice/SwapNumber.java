package com.code.practice;

public class SwapNumber {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;

		y = y + x;
		x = y - x;
		y = y - x;
		System.out.println("x :" + x + " Y " + y);

	}

}
