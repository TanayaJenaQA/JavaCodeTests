package com.code.practice;

import java.util.Arrays;

public class CheckTwoArrayContainsSameElementorNot {

	public static void main(String[] args) {

		String[] data1 = { "I", "AM", "BOY", "INDIA" };
		String[] data2 = { "I", "BOY", "INDIA" ,"AM"};
	
		boolean val = false;
		System.out.println(Arrays.equals(data1, data2));

		if (data1.length == data2.length) {
			for (int i = 0; i < data2.length; i++) {
				if (data1[i].equals(data2[i])) {
					val = true;
					continue;
				} else {
					val = false;
					System.out.println("TWO Arrays Are not equal");
					break;
				}
			}
		}
		if (val) {
			System.out.println("TWO Arrays Are equal");
		}

	}

}
