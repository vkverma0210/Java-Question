import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesInArray {
	
	public static ArrayList<Integer> duplicates(int n, ArrayList<Integer> arr) {
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> res = new ArrayList<>();
		
		for(Integer x : arr) {
			if(hs.contains(x)) {
				res.add(x);
			}
			hs.add(x);
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input1 = scn.nextInt();
		ArrayList <Integer> input2 = new ArrayList<>();
	
		for (int i = 0; i < input1; i++) {
			int s = scn.nextInt();
			input2.add(s);
		}
		
		System.out.println(input2);

		ArrayList<Integer> ans = duplicates(input1, input2);
		System.out.println(ans);
		scn.close();

	}

}
