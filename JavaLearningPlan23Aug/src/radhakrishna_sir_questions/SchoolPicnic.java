package radhakrishna_sir_questions;

import java.util.*;

public class SchoolPicnic {

	private static int solution(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		int cnt = 0;

		for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
			int freq = ele.getValue();
			cnt += freq / 2;
		}

		return cnt;
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		int ans = solution(arr, n);
		System.out.println(ans);
		scn.close();
	}
}
