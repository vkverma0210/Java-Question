package Arrays;

import java.util.Scanner;

public class TrappingRainWater {
    public static long trappingWater(int arr[], int n) {
        long res = 0;

        int left_max = 0;
        int right_max = 0;

        int l = 0;
        int r = n - 1;

        while (l <= r) {
            if (arr[l] < arr[r]) {
                if (arr[l] > left_max)
                    left_max = arr[l];
                else
                    res += left_max - arr[l];

                l++;
            } else {
                if (arr[r] > right_max)
                    right_max = arr[r];
                else
                    res += right_max - arr[r];

                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a1 = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = scn.nextInt();
        }

        long ans = trappingWater(a1, n);

        System.out.println(ans);

        scn.close();
    }
}
