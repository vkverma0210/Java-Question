package Arrays;

import java.util.Scanner;

public class ThreeWayPartitioning {
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void threeWayPartition(int[] array, int a, int b) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (mid <= high) {
            if (array[mid] < a) {
                swap(array, low, mid);
                low++;
                mid++;
            } else {
                if (array[mid] > b) {
                    swap(array, mid, high);
                    high--;
                } else
                    mid++;
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

        int a = scn.nextInt();
        int b = scn.nextInt();

        threeWayPartition(arr, a, b);

        StringBuffer str = new StringBuffer();

        for (int i = 0; i < n; i++) {
            str.append(arr[i] + " ");
        }

        System.out.println(str);

        scn.close();
    }
}