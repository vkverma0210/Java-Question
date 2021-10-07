import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctStrings {

	static int MAX_CHAR = 26;

	static String encodeString(char[] str) {
		int Even[] = new int[MAX_CHAR];
		int Odd[] = new int[MAX_CHAR];

		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			if ((i & 1) != 0)
				Odd[c - 'a']++;
			else
				Even[c - 'a']++;
		}

		String temp = "";

		for (int i = 0; i < MAX_CHAR; i++) {
			temp += (Even[i]);
			temp += ('-');
			temp += (Odd[i]);
			temp += ('-');
		}

		return temp;
	}

	static int countDistinct(ArrayList<String> list) {
		int n = list.size();
		int count = 0;

		Set<String> s = new HashSet<>();

		for (int i = 0; i < n; i++) {
			if (!s.contains(encodeString(list.get(i).toCharArray()))) {
				s.add(encodeString(list.get(i).toCharArray()));
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int n;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			String temp = scn.next();
			list.add(temp);
		}

		System.out.println(countDistinct(list));

		scn.close();
	}

}
