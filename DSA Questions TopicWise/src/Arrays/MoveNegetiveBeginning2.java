//Order Not Matters And No Auxiliary Space

package Arrays;

import java.util.Scanner;

public class MoveNegetiveBeginning2 {

	static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void reverse(int arr[], int l, int r) {
		if (l < r) {
			arr = swap(arr, l, r);
			reverse(arr, ++l, --r);
		}
	}

	public static void merge(int arr[], int l, int m, int r) {
		int i = l;
		int j = m + 1;

		while (i <= m && arr[i] < 0) {
			i++;
		}

		while (j <= r && arr[j] < 0) {
			j++;
		}

		reverse(arr, i, m);
		reverse(arr, m + 1, j - 1);
		reverse(arr, i, j - 1);
	}

	public static void RearrangePosNeg(int[] arr, int left, int right) {

		if (left < right) {
			int mid = left + (right - left) / 2;

			RearrangePosNeg(arr, left, mid);
			RearrangePosNeg(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		RearrangePosNeg(arr, 0, n - 1);

		StringBuffer str = new StringBuffer();

		for (int i = 0; i < n; i++) {
			str.append(arr[i] + " ");
		}

		System.out.println(str);

		scn.close();

	}

}
