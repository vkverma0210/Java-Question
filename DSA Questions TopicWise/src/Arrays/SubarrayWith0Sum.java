package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWith0Sum {
    public static boolean findSum(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<>();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;

            hs.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        boolean ans = findSum(arr, n);

        if (ans == true)
            System.out.println("Yes");
        else
            System.out.println("No");

        scn.close();
    }
}
