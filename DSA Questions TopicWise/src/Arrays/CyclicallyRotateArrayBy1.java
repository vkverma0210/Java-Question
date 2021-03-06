package Arrays;

import java.util.Scanner;

public class CyclicallyRotateArrayBy1 {

	public static void rotate(int[] arr, int n) {
		int temp = arr[n - 1];

		for (int i = n - 1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = temp;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		rotate(arr, n);

		StringBuffer str = new StringBuffer();

		for (int i = 0; i < n; i++) {
			str.append(arr[i] + " ");
		}

		System.out.println(str);

		scn.close();

	}

}
