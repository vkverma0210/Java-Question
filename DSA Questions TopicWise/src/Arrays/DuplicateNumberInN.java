package Arrays;

import java.util.Scanner;

public class DuplicateNumberInN {

    public static int findDuplicate(int[] nums) {
        int duplicate = -1;

        for (int i = 0; i < nums.length; i++) {
            int curr = Math.abs(nums[i]);

            if (nums[curr] < 0) {
                duplicate = curr;
                break;
            }

            nums[curr] *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicate;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findDuplicate(arr);

        System.out.println(ans);

        scn.close();
    }
}
