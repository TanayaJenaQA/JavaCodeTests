package com.code.practice;

import java.util.Arrays;

public class FindTwoMaximumValueFromArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 2, 34, 12, 34, 565, 74, 345 };
		Arrays.sort(num);
		System.out.println("First 2 max values are : "+num[num.length-1]+" "+num[num.length-2]);	
		System.out.println("Minimum Value : "+num[0]);	
	}

}
