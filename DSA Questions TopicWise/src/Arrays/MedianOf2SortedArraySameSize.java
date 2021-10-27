package Arrays;

import java.util.Scanner;

public class MedianOf2SortedArraySameSize {
    public static int getMedian(int[] a, int[] b, int startA, int startB, int endA, int endB) {
        if (endA - startA == 1) {
            return (Math.max(a[startA], b[startB]) + Math.min(a[endA], b[endB])) / 2;
        }

        int m1 = median(a, startA, endA);

        int m2 = median(b, startB, endB);

        if (m1 == m2)
            return m1;
        else if (m1 < m2)
            return getMedian(a, b, (endA + startA + 1) / 2, startB, endA, (endB + startB + 1) / 2);
        else
            return getMedian(a, b, startA, (endB + startB + 1) / 2, (endA + startA + 1) / 2, endB);
    }

    private static int median(int[] arr, int start, int end) {
        int n = end - start + 1;

        if (n % 2 == 0)
            return (arr[start + (n / 2)] + arr[start + (n / 2 - 1)]) / 2;
        else
            return arr[start + n / 2];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int ar1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            ar1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int ar2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            ar2[i] = scn.nextInt();
        }

        if (n1 != n2) {
            System.out.println("Doesn't work for arrays " + "of unequal size");
        } else if (n1 == 0) {
            System.out.println("Arrays are empty.");
        } else if (n1 == 1) {
            System.out.println((ar1[0] + ar2[0]) / 2);
        } else {
            System.out.println("Median is " + getMedian(ar1, ar2, 0, 0, ar1.length - 1, ar2.length - 1));
        }

        scn.close();
    }
}
