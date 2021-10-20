package Arrays;

import java.util.Scanner;

public class TimeToSellBuyStock {
    public static int maxProfit(int[] prices) {
        int n = prices.length;

        if (n < 2) {
            return 0;
        }

        int ans = 0;
        int minInd = 0;
        int maxInd = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] <= prices[minInd]) {
                minInd = i;
                maxInd = i;
            } else if (prices[i] > prices[maxInd]) {
                maxInd = i;
            }

            if (maxInd > minInd) {
                ans = Math.max(ans, prices[maxInd] - prices[minInd]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = maxProfit(arr);

        System.out.println(ans);

        scn.close();
    }
}
