package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
    public static int findLongestConseqSubseq(int arr[], int n) {
        HashSet<Integer> hs = new HashSet<>();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int j = arr[i];
                while (hs.contains(j))
                    j++;

                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findLongestConseqSubseq(arr, n);

        System.out.println(ans);

        scn.close();
    }
}
