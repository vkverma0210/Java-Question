package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElemensIn3SortedArray {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> ls = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        int p1, p2, p3;

        p1 = p2 = p3 = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {
            while (i < n1 && A[i] == p1)
                i++;

            while (j < n2 && B[j] == p2)
                j++;

            while (k < n3 && C[k] == p3)
                k++;

            if (i < n1 && j < n2 && k < n3) {
                if (A[i] == B[j] && B[j] == C[k]) {
                    ls.add(A[i]);
                    p1 = A[i];
                    p2 = B[j];
                    p3 = C[k];
                    i++;
                    j++;
                    k++;
                } else if (A[i] < B[j]) {
                    p1 = A[i];
                    i++;
                } else if (B[j] < C[k]) {
                    p2 = B[j];
                    j++;
                } else {
                    p3 = C[k];
                    k++;
                }
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int A[] = new int[n1];
        int B[] = new int[n2];
        int C[] = new int[n3];

        for (int i = 0; i < n1; i++) {
            A[i] = scn.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            B[i] = scn.nextInt();
        }

        for (int i = 0; i < n3; i++) {
            C[i] = scn.nextInt();
        }

        ArrayList<Integer> ans = commonElements(A, B, C, n1, n2, n3);

        if (ans.size() == 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
        }

        System.out.println();

        scn.close();
    }
}
