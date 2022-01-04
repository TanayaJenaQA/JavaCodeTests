package com.code.practice;

import java.util.ArrayList;

public class FindDuplicateStringFromArray {

	public static void main(String[] args) {

		String[] data = { "hello", "test", "mom", "dad", "ram", "mom", "test" };
		ArrayList<String> arraylist = new ArrayList<>();
		ArrayList<String> arraylist2 = new ArrayList<>();

		for (String val : data) {
			if (!arraylist.contains(val)) {
				arraylist.add(val);
			} else {
				arraylist2.add(val);
			}
		}
		System.out.println("Single vals are" + arraylist);
		System.out.println("Deplicate vals are" + arraylist2);
	}

}
