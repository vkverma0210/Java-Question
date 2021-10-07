import java.util.Scanner;

public class ReduceString {

	public static String reducedString(String str) {

		int len = str.length();

		StringBuilder sb = new StringBuilder();

		int currLen = 1;
		char currChar = str.charAt(0);

		for (int i = 1; i < len; i++) {
			if (str.charAt(i) == currChar) {
				currLen++;
			} else {
				sb.append(currLen).append(currChar);
				currLen = 1;
				currChar = str.charAt(i);
			}
		}

		sb.append(currLen).append(currChar);

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		if (str.matches("[a-zA-Z0-9]+")) {
			System.out.println("string contains lowercase or uppercase alphabets or number 0-9 only");
		} else {
			System.out.println("string contains other than lowercase or uppercase alphabets or number 0-9 only");
			System.exit(0);
		}

		String ans = reducedString(str);

		System.out.println(ans);
		scn.close();
	}

}
