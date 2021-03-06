package Arrays;

import java.util.Scanner;

public class LarsgestSumContiguousSubArray {

	public static int maxSubarraySum(int[] arr, int n) {
		int curr_max = arr[0];
		int max_so_far = arr[0];

		for (int i = 1; i < n; i++) {
			curr_max = Math.max(arr[i], arr[i] + curr_max);
			max_so_far = Math.max(max_so_far, curr_max);
		}

		return max_so_far;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int ans = maxSubarraySum(arr, n);

		System.out.println(ans);

		scn.close();

	}

}
