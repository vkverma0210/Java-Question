package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeIntervalsInArray {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> res = new ArrayList<>();
        int[] newInterval = intervals[0];
        res.add(newInterval);

        for (int[] interval : intervals) {
            if (newInterval[1] >= interval[0]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                res.add(newInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }

        int ans[][] = merge(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println("[" + ans[i][0] + " " + ans[i][1] + "]");
        }

        scn.close();
    }
}
