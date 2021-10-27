package Arrays;

import java.util.Scanner;

public class PalindromicArray {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            int sum = 0;

            while (temp != 0) {
                int lastDigit = temp % 10;
                sum = sum * 10 + lastDigit;
                temp /= 10;
            }

            if (sum != a[i])
                return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = palinArray(arr, n);

        System.out.println(ans);

        scn.close();
    }
}