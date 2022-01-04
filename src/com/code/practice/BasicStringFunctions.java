package com.code.practice;

public class BasicStringFunctions {

	public static void main(String[] args) {
		
		String  x = "data";
		String y = "data";
		 
		System.out.println(x==y);
//		
//		\w	Matches the word characters.
//		\W	Matches the nonword characters.
//		\s	Matches the whitespace. Equivalent to [\t\n\r\f].
//		\S	Matches the nonwhitespace.
//		\d	Matches the digits. Equivalent to [0-9].
//		\D	Matches the nondigits.
//		[A-Z,a-z] Matches the all alphabets 
//		[^A-z,a-z] Matches all non alphabets 

//		String data = "Test My Code";		
//		System.out.println(data.replace(" ", ""));
			
		String data1 = "Test My Code Two 1234";	
		System.out.println(data1.replaceAll("\\D", ""));
	}

}
	