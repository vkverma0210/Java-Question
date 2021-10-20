package com.string;

public class StringJoinDemo {

	public static void main(String[] args) {
		String result = String.join(" ", "Alpha", "Beta", "gamma");
		System.out.println(result);
		
		result = String.join(", ", "John", "ID#: 569", "E-Mail: John@HerbSchildt.com");
		System.out.println(result);

	}

}
