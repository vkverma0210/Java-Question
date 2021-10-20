import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonInSortedArrays {

	public static int[] commonElementsInSortesArrays(int m, int n, int[] arr1, int [] arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		if(m > 0 && n > 0)
		{
			Set<Integer> set = new HashSet<>();
			for(int i = 0; i < m; i++) {
				set.add(arr1[i]);
			}
			
			for(int j = 0; j < n; j++) {
				if(set.contains(arr2[j])) {
					ans.add(arr2[j]);
				}
			}
		}
		
		int [] res = new int[ans.size()];
		int i = 0;
		for(int el : ans) {
			res[i++] = el;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
 		int arr1[] = new int[m];
		int arr2[] = new int[n];

		for (int i = 0; i < m; i++) {
			arr1[i] = scn.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr2[i] = scn.nextInt();
		}

		int[] ans = commonElementsInSortesArrays(m, n, arr1, arr2);
		
		for(int i = 0; i < ans.length; i++)
		{
			System.out.println(ans[i]);
		}
		
		scn.close();

	}

}
