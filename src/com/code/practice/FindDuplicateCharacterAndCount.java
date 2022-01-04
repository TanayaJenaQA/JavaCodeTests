package com.code.practice;

import java.util.HashMap;

public class FindDuplicateCharacterAndCount {

	public static void main(String[] args) {

		String data = "AaBcggsdsdadeewPT";
		data = data.toUpperCase();
		char[] chardata = data.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < chardata.length - 1; i++) {
			if (hmap.containsKey(chardata[i])) {
				hmap.put(chardata[i], hmap.get(chardata[i]) + 1);
			} else {
				hmap.put(chardata[i], 1);
			}

		}

		System.out.println(hmap);
		 
		for (char c : hmap.keySet()) {
			if(hmap.get(c)>1) {
				System.out.println(c+" = "+hmap.get(c));
			}
		}
	}

}
