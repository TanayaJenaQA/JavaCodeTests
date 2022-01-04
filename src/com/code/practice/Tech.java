package com.code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tech {

	public static void main(String[] args) {
		String s = "aaabdbdsdsd";
		StringBuffer sb = null;
		int len = s.length();
		String temp = "";
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				temp = s.substring(i, j);
				if(temp.length()>=1) {
					sb = new StringBuffer(temp);
					if(sb.reverse().toString().equals(temp)) {
						if(!ar.contains(temp)) {
							ar.add(temp);
						}
					}
				}
				else {
					break;
				}
			}
		}
		
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar.get(ar.size()-1));
		Object[] d = new String[ar.size()];
		d =ar.toArray();
		Arrays.sort(d);
	for (int i = 0; i < d.length; i++) {
		System.out.println(d[i]);
		
	}

	}

}
