package com.code.practice;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {

		String x = "abcd".toLowerCase();
		char[] a = x.toCharArray();
		String y = "ADBCE".toLowerCase();
		char[] b = y.toCharArray();

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		if (!(a.length == b.length)) {
			System.out.println("String are not anagram");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (!hashmap.containsKey(a[i])) {
					hashmap.put(a[i], 1);
				} else {
					hashmap.put(a[i], hashmap.get(a[i]) + 1);
				}
			}

			for (int i = 0; i < b.length; i++) {
				if (hashmap.containsKey(b[i])) {
					hashmap.remove(b[i]);
				} else {
					hashmap.put(b[i],1);
				}
			}
			if(hashmap.size()>0) {
				System.out.println(" Not Anagram");
			}
			else {
				System.out.println("Anagram");
			}

		}
		
		
	}

}
