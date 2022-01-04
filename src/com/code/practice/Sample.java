package com.code.practice;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

	int[] data = {1,2,1,3,6,4,5,3,9,7,8,0};
	List<Integer> data2 = new ArrayList<Integer>();
	for (int i = 0; i < data.length; i++) {
		data2.add(data[i]);
	}	
	 int start = data2.indexOf(6);
	 int end = data2.indexOf(9);
	 
	
	for (int i = start; i < end; i++) {
		data2.remove(data[i]);
	}
	 System.out.println(data2);
	}

}
