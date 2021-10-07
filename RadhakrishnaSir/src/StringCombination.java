import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCombination {
	static List<String> al = new ArrayList<>();
	
	public static void generateCombinations(String str, String ans){
		
		if(str.length() == 0) {
			al.add(ans);
			return;
		}
		
		generateCombinations(str.substring(1), ans + str.charAt(0));
		
		generateCombinations(str.substring(1), ans);
	}
	
	public static void allCombination(String str) {
		
		generateCombinations(str, "");
		
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		allCombination(str);
		System.out.println(al);
		
		scn.close();
	}

}
