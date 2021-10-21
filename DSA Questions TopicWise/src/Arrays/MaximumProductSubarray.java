package Arrays;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static long maxProduct(int[] arr, int n) {
        long minVal = arr[0];
        long maxVal = arr[0];

        long maxProduct = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                long temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            maxProduct = Math.max(maxProduct, maxVal);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        long ans = maxProduct(arr, n);

        System.out.println(ans);

        scn.close();
    }
}
