package com.code.practice;

public class SubstringPallindrom {

	public static void main(String[] args) {
		 String str = "abbaeae";
	        // Call the method
	        System.out.println(countPS(str));
	}
	
	
	static int countPS(String str){
        String temp = "";
        StringBuffer stf;
        int count = 0;
        // Iterate the loop twice
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // Get each substring
                temp = str.substring(i, j);
                  
                // If length is greater than or equal to two
                // Check for palindrome    
                if (temp.length() >= 1) {
                    // Use StringBuffer class to reverse the string
                    stf = new StringBuffer(temp);
                    stf.reverse();
                    // Compare substring wih reverse of substring
                    if (stf.toString().compareTo(temp) == 0)
                    	System.out.println(stf.toString());
                        count++;
                }
            }
        }
        // return the count
        return count;
    }

}
