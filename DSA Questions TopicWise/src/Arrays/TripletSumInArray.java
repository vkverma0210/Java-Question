package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumInArray {
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);

        for (int i = 0; i < n; i++) {
            int sum = X - A[i];

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                if (A[l] + A[r] == sum)
                    return true;
                else if (A[l] + A[r] < sum)
                    l++;
                else
                    r--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a1 = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = scn.nextInt();
        }

        int X = scn.nextInt();

        boolean ans = find3Numbers(a1, n, X);

        System.out.println(ans ? 1 : 0);

        scn.close();

    }
}
