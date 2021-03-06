package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Reverse {
	public static String reverseWord(String str) {
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		return reverseString;
	}

}

public class ReverseString {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			String str = read.readLine();
			new Reverse();
			System.out.println(Reverse.reverseWord(str));
		}
	}
}
