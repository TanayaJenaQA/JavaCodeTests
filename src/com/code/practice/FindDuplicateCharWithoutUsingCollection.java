package com.code.practice;

public class FindDuplicateCharWithoutUsingCollection {

	public static void main(String[] args) {
		String x = "hello test menthod";
		char[] ch = x.replaceAll("\\s", "").toCharArray();

		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.println("Key :" + ch[i] + "=" + x.replaceAll("[^" + ch[i] + "]", "").length());

		}

	}

}
