package com.code.practice;

import java.util.ArrayList;

public class FindDuplicateNumberFromArray {

//	 Find duplicate number from array
	public static void main(String[] args) {
		
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 3, 5, 7, 6 };

		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		for (Integer val : data) {
			if (!arraylist1.contains(val)) {
				arraylist1.add(val);
			} else {
				arraylist2.add(val);
			}

		}
		System.out.println("Single Values are :"+arraylist1);
		System.out.println("Duplicate Values are :"+arraylist2);

	}

}
