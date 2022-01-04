package com.code.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollection {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("Hello9");
		data.add("Hello2");
		data.add("Hello4");
		data.add("Hello5");
		data.add("Apple");
		data.add("Hello6");
		data.add("Hello1");

		// Ascending order
		Collections.sort(data);
		System.out.println(data);
		
		// Descending Order
		Collections.reverse(data);
		System.out.println(data);

	}

}
