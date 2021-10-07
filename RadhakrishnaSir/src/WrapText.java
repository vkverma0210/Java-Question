import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class WrapText {

	final static int MAX = Integer.MAX_VALUE;
	
	public static void textWrap(String str, int len) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (String word : str.split(" ")) {
			temp.add(word.length());
		}

		int n = temp.size();

		int extras[][] = new int[n + 1][n + 1];

		int lc[][] = new int[n + 1][n + 1];

		int c[] = new int[n + 1];
		int p[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			extras[i][i] = len - temp.indexOf(i - 1);

			for (int j = i + 1; j <= n; j++) {
				extras[i][j] = extras[i][j - 1] - temp.indexOf(j - 1) - 1;
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				if(extras[i][j] < 0)
					lc[i][j] = MAX;
				else if(j == n && extras[i][j] >= 0)
					lc[i][j] = 0;
				else
					lc[i][j] = extras[i][j] * extras[i][j];
			}
		}
		
		c[0] = 0;
		
		for(int i = 1; i <= n; i++) {
			c[i] = MAX;
			for(int j = 1; j <= i; j++)
				if(c[j - 1] != MAX && lc[j][i] != MAX && (c[j - 1] + lc[j][i] < c[i])) {
					c[i] = c[j - 1] + lc[j][i];
					p[i] = j;
				}
		}
			
		for(int i = 0; i < n; i++) {
			System.out.println(p[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		textWrap(str, 80);
//		String[] ans = textWrap(str, 80);

//		System.out.println(ans);
		scn.close();
	}

}
