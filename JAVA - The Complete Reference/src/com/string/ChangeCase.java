package com.string;

public class ChangeCase {

	public static void main(String[] args) {
		String s = "This is a test.";
		
		System.out.println("original: " + s);
		
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		
		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}

}
