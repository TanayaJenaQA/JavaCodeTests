package com.code.practice;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
     
		LinkedList<Integer> data = new LinkedList<Integer>();
		data.add(4);
		data.add(1);
		data.add(2);
		data.add(3);
		
//		// Reverse based on Alphabetical order then you must use sort() and reverse() method
//		Collections.sort(data);
//		Collections.reverse(data);
//		System.out.println(data);
		
		// Reverse based on Insertion order then you must use reverse() method
		Collections.reverse(data);
		System.out.println(data);
		
		
		
	}

}
