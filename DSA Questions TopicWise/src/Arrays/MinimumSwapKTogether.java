package Arrays;

import java.util.Scanner;

public class MinimumSwapKTogether {
    public static int minSwap(int[] arr, int n, int k) {
        int lessK = 0;
        int greatK = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] <= k)
                lessK++;

        for (int i = 0; i < lessK; i++)
            if (arr[i] > k)
                greatK++;

        int swaps = greatK;
        int i = 0;
        int j = lessK;

        while (j < n) {
            if (arr[i] > k)
                greatK--;

            if (arr[j] > k)
                greatK++;

            swaps = Math.min(swaps, greatK);
            i++;
            j++;
        }

        return swaps;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int ans = minSwap(arr, n, k);

        System.out.println(ans);

        scn.close();
    }
}