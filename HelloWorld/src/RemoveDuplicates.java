import java.util.Arrays;

public class RemoveDuplicates {

	static int arr[] = { 6, 7, 7, 7, 7, 8, 8, 9, 8, 8, 6, 6 };

	// 1, 1, 2, 3, 4, 5, 5, 6, 6, 9
	// 1, 2, 3, 4, 5, 6, 9, 1, 5, 6,
	public static void remove(int[] arr) {
		int n = arr.length;

		Arrays.sort(arr);

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		remove(arr);

	}

}
