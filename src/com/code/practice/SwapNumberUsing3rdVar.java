package com.code.practice;

public class SwapNumberUsing3rdVar {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int t = 0;

		t = x + y;
		y = t - y;
		x = t - x;
		System.out.println(x + " " + y);

	}

}
