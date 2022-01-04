package com.code.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateWordAndCount {

	public static void main(String[] args) {
		String data = "Hello My World is My Home";

		String[] dataArray = data.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < dataArray.length; i++) {
			if (map.containsKey(dataArray[i])) {
				map.put(dataArray[i], map.get(dataArray[i]) + 1);
			} else
				map.put(dataArray[i], 1);
		}
		
		for (Entry<String, Integer> val : map.entrySet()) {
			System.out.println(val.getKey()+"="+val.getValue());
		}
	}

}
