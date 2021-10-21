package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMoreThanNDivK {
    public static int countOccurance(int[] arr, int n, int k) {
        int num = n / k;
        int count = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]))
                hm.replace(arr[i], hm.get(arr[i]) + 1);
            else
                hm.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > num)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int ans = countOccurance(arr, n, k);

        System.out.println(ans);

        scn.close();
    }
}
