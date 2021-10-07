import java.util.Scanner;

public class LongestPalindrome {

	public static String longestPalSubstr(String str) {
		int maxLength = 1;
		
		int start = 0;
		int len = str.length();
		
		int low, high;
		
		for(int i = 1; i< len; i++) {
			low = i - 1;
			high = i;
			
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
			}
			
			low++;
			high--;
			
			if(str.charAt(low) == str.charAt(high) && high - low + 1 > maxLength) {
				start = low;
				maxLength = high - low + 1;
			}
			
			low = i- 1;
			high = i +1;
			
			while(low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
			}
			
			low++;
			high--;
			
			
			if(str.charAt(low) == str.charAt(high) && high - low + 1 > maxLength) {
				start = low;
				maxLength = high - low + 1;
			}
		}
		
		return str.substring(start, start + maxLength);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		String ans = longestPalSubstr(str);
		System.out.println(ans);
		scn.close();
	}
	
}
