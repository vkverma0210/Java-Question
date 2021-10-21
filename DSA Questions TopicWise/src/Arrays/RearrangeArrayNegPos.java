
package Arrays;

import java.util.Scanner;

public class RearrangeArrayNegPos {
    public static void rearrange(int arr[], int n) {
        int i = 0, j = n - 1;

        while (i < j) {
            while (i <= n - 1 && arr[i] > 0)
                i++;

            while (j >= 0 && arr[j] < 0)
                j--;

            if (i < j)
                swap(arr, i, j);
        }

        if (i == 0 || i == n)
            return;

        int k = 0;

        while (k < n && i < n) {
            swap(arr, k, i);
            i++;
            k += 2;
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        rearrange(arr, n);

        StringBuffer str = new StringBuffer();

        for (int i = 0; i < n; i++) {
            str.append(arr[i] + " ");
        }

        System.out.println(str);

        scn.close();
    }
}
