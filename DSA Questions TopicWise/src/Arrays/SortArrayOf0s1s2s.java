package Arrays;

import java.util.Scanner;

public class SortArrayOf0s1s2s {

	public static void sort012(int[] arr, int n) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				count0++;
			} else if(arr[i] == 1) {
				count1++;
			}
			else
			{
				count2++;
			}
		}
		
		int j = 0;
		
		while(count0 != 0) {
			arr[j++] = 0;
			count0--;
		}
		
		while(count1 != 0) {
			arr[j++] = 1;
			count1--;
		}
		
		while(count2 != 0) {
			arr[j++] = 2;
			count2--;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		
		sort012(arr, n);
		
		StringBuffer str = new StringBuffer();
		
		for(int i = 0; i < n; i++) {
			str.append(arr[i] + " ");
		}
		
		System.out.println(str);
		
		scn.close();
	}

}
