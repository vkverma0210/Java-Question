//Order Not Matters And No Auxiliary Space

package Arrays;

import java.util.Scanner;

public class MoveNegetiveBeginning1 {

	public static void shiftAll(int[] arr, int n) {
		int left = 0;
		int right = n - 1;

		while (left <= right) {
			
			if (arr[left] < 0 && arr[right] < 0) {
				left++;
			} else if (arr[left] > 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			} else if (arr[left] > 0 && arr[right] > 0) {
				right--;
			} else {
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		shiftAll(arr, n);

		StringBuffer str = new StringBuffer();

		for (int i = 0; i < n; i++) {
			str.append(arr[i] + " ");
		}

		System.out.println(str);

		scn.close();

	}

}
