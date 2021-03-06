package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOf2Arrays {
	
	public static int doIntersection(int[] a, int n, int[] b, int m) {
		HashSet<Integer> hs = new HashSet<>();
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			hs.add(a[i]);
		}

		for (int i = 0; i < m; i++) {
			if (hs.contains(b[i])) {
				hs.remove(b[i]);
				ans++;
			}
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}

		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = scn.nextInt();
		}

		int ans = doIntersection(a, n, b, m);

		System.out.println(ans);

		scn.close();

	}

}
