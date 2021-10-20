package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArrayWithoutExtraSpace {

    public static void merge(int arr1[], int arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;

        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                arr1[i] = arr1[i] + arr2[j];
                arr2[j] = arr1[i] - arr2[j];
                arr1[i] = arr1[i] - arr2[j];
            }

            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int arr2[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        merge(arr1, arr2, n, m);

        StringBuffer str = new StringBuffer();

        for (int i = 0; i < n; i++) {
            str.append(arr1[i] + " ");
        }

        for (int i = 0; i < m; i++) {
            str.append(arr2[i] + " ");
        }

        System.out.println(str);

        scn.close();

    }
}
