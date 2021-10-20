import java.util.Scanner;

public class ExerciseProblem {
	
	private static void getPrimes(int[] arr) {
		int n = 1000;
		boolean[] vis = new boolean[n + 1];
		for (int i = 2; i * i <= n; i++) {
			if (!vis[i]) {
				for (int j = i * i; j <= n; j += i) {
					vis[j] = true;
				}
			}
		}

		int cnt = arr.length;
		int i = 2;
		int j = 0;
		while (cnt > 0) {
			if (!vis[i]) {
				arr[j] = i;
				j++;
				cnt--;
			}
			i++;
		}
	}

	private static int solution(int[] arr, int target) {
		int m = arr.length;
		int dp[] = new int[target + 1];

		for (int i = 1; i <= target; i++)
			dp[i] = Integer.MAX_VALUE;

		for (int i = 1; i <= target; i++) {
			for (int j = 0; j < m; j++)
				if (arr[j] <= i) {
					int sub_res = dp[i - arr[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < dp[i])
						dp[i] = sub_res + 1;
				}
		}

		if (dp[target] == Integer.MAX_VALUE)
			return -1;

		return dp[target];
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int sum = scn.nextInt();
		int levels = scn.nextInt();
		int arr[] = new int[levels];
		getPrimes(arr);
		int finalDays = solution(arr, sum);
		System.out.println(finalDays);
		scn.close();
	}

}
