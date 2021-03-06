package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			int k = scn.nextInt();

			System.out.println(kthSmallest(arr, 0, n - 1, k));
			
			scn.close();
		}
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		Arrays.sort(arr, l, r + 1);

		return arr[k - 1];
	}

}
