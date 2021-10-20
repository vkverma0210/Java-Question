import java.util.Scanner;

public class RotateCheckString {

	public static int rotateString(String input, int n) {
		input = input.toLowerCase();
		
		String[] parts = input.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(String s : parts) {
			int len = s.length();
			int rotation = n % len;
			sb.append(s.substring(rotation) + s.substring(0, rotation)+ " ");
		}
		
		String ansStr = sb.toString().trim();
		System.out.println(ansStr);
		
		return ansStr.equals(input)? 1 : 0;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		int n = scn.nextInt();
		
		int ans = rotateString(input, n);
		System.out.println(ans);
		scn.close();
	}

}
