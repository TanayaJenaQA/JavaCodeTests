package com.code.practice;

public class FindCountUpperLowercaseAndSpecialCase {

	public static void main(String[] args) {
		String val = "Test123!@#$%^&]***MYKEYwords";
		
		System.out.println("Lower case letters : " +  val.replaceAll("[^a-z]", "").length());
		System.out.println("Upper case letters : " +  val.replaceAll("[^A-Z]", "").length());
		System.out.println("Number : " +  val.replaceAll("[^0-9]", "").length());
		System.out.println("Special characters : " +  val.replaceAll("[a-z,A-Z,0-9]", "").length());

	}

}
