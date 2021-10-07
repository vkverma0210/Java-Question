package radhakrishna_sir_questions;

import java.util.Scanner;

public class CandyDistributions {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		candiesDistribution(n, k);

		scn.close();
	}

	static void candiesDistribution(int n, int k) {
		int count = 0;

		int arr[] = new int[k];

		int low = 0;
		int high = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			int sum = (mid * (mid + 1)) / 2;

			if (sum <= n) {
				count = mid / k;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		int last = (count * k);

		n -= (last * (last + 1)) / 2;

		int j = 0;

		int term = (count * k) + 1;

		while (n > 0) {
			if (term <= n) {
				arr[j++] = term;
				n -= term;
				term++;
			} else {
				arr[j] += n;
				n = 0;
			}
		}

		for (int i = 0; i < k; i++) {
			arr[i] += (count * (i + 1)) + (k * (count * (count - 1)) / 2);
		}

		for (int i = 0; i < k; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
