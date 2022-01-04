package com.code.practice;

public class FindAllVowelLettersFromString {

	public static void main(String[] args) {

		String test = "I am a Boy from India";
//		System.out.println(test.replaceAll("[^A,E,I,O,U,a,e,i,o,u]", ""));
         
		test = test.replaceAll("\\s", "");
		for (int i = 0; i < test.length(); i++) {
			String val = String.valueOf(test.charAt(i));
			if ("AEIOUaeiou".contains(val)) {
				System.out.println(val + " is Vowel letter");
			} else {
				System.out.println(val + " is Consonent letter");
			}

		}

	}

}
