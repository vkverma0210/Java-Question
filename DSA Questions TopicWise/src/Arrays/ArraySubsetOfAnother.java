package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class ArraySubsetOfAnother {
    public static String isSubset(long a1[], long a2[], long n, long m) {
        HashSet<Long> hs = new HashSet<>();

        for (int i = 0; i < n; i++)
            hs.add(a1[i]);

        for (int i = 0; i < m; i++) {
            if (!hs.contains(a2[i]))
                return "No";
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();

        long[] a1 = new long[(int) n];

        for (int i = 0; i < n; i++) {
            a1[i] = scn.nextInt();
        }

        long m = scn.nextLong();

        long[] a2 = new long[(int) n];

        for (int i = 0; i < m; i++) {
            a2[i] = scn.nextInt();
        }

        String ans = isSubset(a1, a2, n, m);

        System.out.println(ans);

        scn.close();
    }
}
