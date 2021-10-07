import java.util.Scanner;

public class ReverseWord {

	public static String reverseWordInString(String str) {
		String words[] = str.split("\\s");
		String ans = "";
		
		for(String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			ans += sb.toString() + " ";
		}
		
		return ans.trim();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(reverseWordInString(str));
		scn.close();
	}

}