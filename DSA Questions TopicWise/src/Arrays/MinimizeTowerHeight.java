package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTowerHeight {

	public static int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);

		int min, max;

		int res = Math.abs(arr[0] - arr[n - 1]);

		for (int i = 1; i < n; i++) {
			if (arr[i] >= k) {
				max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
				min = Math.min(arr[0] + k, arr[i] - k);
				res = Math.min(res, max - min);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();

		int ans = getMinDiff(arr, n, k);

		System.out.println(ans);

		scn.close();

	}
}