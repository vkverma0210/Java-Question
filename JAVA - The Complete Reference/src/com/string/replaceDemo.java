package com.string;

public class replaceDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this is a test.");
		sb.replace(5, 7, "was");
		
		System.out.println("After replace : " + sb);
		
	}

}
