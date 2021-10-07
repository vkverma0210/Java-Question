import java.util.Scanner;

public class MagicStick {

	public static int minCostStick(int input1, int[] input2, int[] input3) {
		int minCost = Integer.MAX_VALUE;
		int maxLen = Integer.MIN_VALUE;

		for (int i = 0; i < input1; i++) {
			maxLen = Math.max(maxLen, input2[i]);
		}

		for (int i = 0; i <= maxLen; i++) {
			int currCost = 0;

			for (int j = 0; j < input1; j++) {
				currCost += Math.abs(input2[j] - i) * input3[j];
			}

			minCost = Math.min(minCost, currCost);
		}

		return minCost;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input1 = scn.nextInt();
		int input2[] = new int[input1];
		int input3[] = new int[input1];

		for (int i = 0; i < input1; i++) {
			input2[i] = scn.nextInt();
		}

		for (int i = 0; i < input1; i++) {
			input3[i] = scn.nextInt();
		}

		int minCost = minCostStick(input1, input2, input3);
		System.out.println(minCost);
		scn.close();
	}

}
