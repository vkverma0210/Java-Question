package Arrays;

import java.util.Scanner;

public class SmallestSubarrayWithSumGreatX {
    public static int smallestSubWithSum(int a[], int n, int x) {
        int curr_sum = 0;
        int min_len = n + 1;

        int start = 0;
        int end = 0;

        while (end < n) {
            while (curr_sum <= x && end < n)
                curr_sum += a[end++];

            while (curr_sum > x && start < n) {
                if (end - start < min_len)
                    min_len = end - start;

                curr_sum -= a[start++];
            }
        }

        return min_len;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int ans = smallestSubWithSum(arr, n, x);

        System.out.println(ans);

        scn.close();
    }
}
