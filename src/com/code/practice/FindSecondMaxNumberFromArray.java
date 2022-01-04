package com.code.practice;

import java.util.Arrays;

public class FindSecondMaxNumberFromArray {

	public static void main(String[] args) {

		int[] data = {12,232,42211,23,232,997,888,234};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
	}

}
