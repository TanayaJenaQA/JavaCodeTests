package com.code.practice;

import java.util.HashMap;

public class ValueLabsTest {
	
	

	public static void main(String[] args) {	
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		System.out.println("The Value You Entered are :");

		for (int i = 0; i < 100; i++) {
		int val = ((int)(Math.random()*(5000 - 1)+1));
		System.out.println(val);
		char[] ch = String.valueOf(val).toCharArray();
		
		for (int j = 0; j < ch.length; j++) {
			if(!map.containsKey(ch[j])) {				
				map.put(ch[j], 1);
			}
			else {
				map.put(ch[j], map.get(ch[j])+1);
			}
		}
			
		}
		System.out.println("Number Of Occurance : ");
		System.out.println(map);
		
	}
	
	

}
