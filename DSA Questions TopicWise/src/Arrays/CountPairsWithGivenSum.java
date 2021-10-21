package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairsWithGivenSum {
    public static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }

        int twice_count = 0;

        for (int i = 0; i < n; i++) {
            if (hm.get(k - arr[i]) != null)
                twice_count += hm.get(k - arr[i]);

            if (k - arr[i] == arr[i])
                twice_count--;
        }

        return twice_count / 2;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int ans = getPairsCount(arr, n, k);

        System.out.println(ans);

        scn.close();
    }

}