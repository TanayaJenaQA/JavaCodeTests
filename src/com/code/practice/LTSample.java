package com.code.practice;

public class LTSample extends Parent {
	
	static void show()
	{
	System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		
Parent data = new LTSample();
data.show();
	}

}
