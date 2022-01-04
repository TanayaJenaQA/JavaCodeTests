package com.code.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateMAP {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("val1", "one");
		map.put("val3", "two");
		map.put("val2", "three");
		map.put("val4", "four");
		map.put("val5", "five");

		Iterator itr = map.entrySet().iterator();

		while (itr.hasNext()) {
         Entry<String,String> data = (Entry<String, String>) itr.next();
         System.out.println(data.getKey()+" = "+data.getValue());
		}

	}

}
