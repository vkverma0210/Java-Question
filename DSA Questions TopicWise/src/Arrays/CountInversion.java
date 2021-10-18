package Arrays;

import java.util.Scanner;

public class CountInversion {
    private static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;

        long count = 0;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }

    private static long mergeSortHelper(long[] arr, long[] temp, int left, int right) {
        int mid;
        long count = 0;

        if (right > left) {
            mid = (right + left) / 2;

            count += mergeSortHelper(arr, temp, left, mid);
            count += mergeSortHelper(arr, temp, mid + 1, right);
            count += merge(arr, temp, left, mid + 1, right);

        }

        return count;
    }

    public static long inversionCount(long arr[], long N) {
        int n = (int) N;
        long[] temp = new long[arr.length];
        return mergeSortHelper(arr, temp, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextInt();

        long arr[] = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        long ans = inversionCount(arr, n);

        System.out.println(ans);

        scn.close();
    }
}
