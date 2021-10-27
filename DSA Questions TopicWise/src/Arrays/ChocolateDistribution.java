package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChocolateDistribution {
    public static long finMinDiff(ArrayList<Long> a, long n, long m) {
        Collections.sort(a);
        long ans = Long.MAX_VALUE;

        if (n == m)
            return a.get(Math.toIntExact(n - 1)) - a.get(0);

        for (int i = 0; i < n - m + 1; i++) {
            long temp = a.get(Math.toIntExact(i + m - 1)) - a.get(i);
            ans = Math.min(ans, temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextInt();

        ArrayList<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long x = scn.nextLong();
            arr.add(x);
        }

        long m = scn.nextLong();

        Long ans = finMinDiff(arr, n, m);
        System.out.println(ans);

        scn.close();
    }
}
