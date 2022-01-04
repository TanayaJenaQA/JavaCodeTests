package com.code.practice;

public class BubbleSortArrayOnNumber {

	public static void main(String[] args) {

		int val[] = { 100, 3, 102, 4, 50 };
		
		
		int numberofIteration = val.length - 1;
		for (int i = 0; i < numberofIteration; i++) {
			for (int j = 0; j < numberofIteration; j++) {
				if (val[j] > val[j + 1]) {
					int temp = val[j];
					val[j] = val[j + 1];
					val[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + ",");
		}
	}
}
