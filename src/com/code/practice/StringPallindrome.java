package com.code.practice;

import java.util.HashSet;
import java.util.Set;

public class StringPallindrome {

	public static void main(String[] args) {
		
		String s = "aaabaDeeTet";
		int len = s.length();
		
		StringBuffer sb = null;
		String temp = "";
		Set<String> newData = new HashSet<String>();
		
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j <=len; j++) {
				temp = s.substring(i, j);
				sb = new StringBuffer(temp);
			
				if (temp.length()>=1) {
					if (temp.equals(sb.reverse().toString())) {
						newData.add(temp);
					}
					
				}
			}
		}
		System.out.print(newData);
		

	}

}
