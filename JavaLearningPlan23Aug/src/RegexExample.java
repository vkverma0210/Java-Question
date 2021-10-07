import java.util.regex.*;

public class RegexExample {

	public static void main(String[] args) {
		// 1st Way
		Pattern p = Pattern.compile("..m");
		Matcher m = p.matcher("aim");
		boolean b = m.matches();
		System.out.println(b);

		// 2nd Way
		boolean b2 = Pattern.compile(".m").matcher("monica").matches();
		System.out.println(b2);

		// 3rd Way
		boolean b3 = Pattern.matches(".m", "am");
		System.out.println(b3);

		// 4th Way
		System.out.println("4th Way");
		System.out.println(Pattern.matches("amn", "acd"));
		System.out.println(Pattern.matches("[amn]", "a")); // among a, m, n
		System.out.println(Pattern.matches("[^amn]", "c")); // any character leaving a, m, n
		System.out.println(Pattern.matches("[a-zA-S]", "T")); // any character which are range between a to z and A to Z
		System.out.println(Pattern.matches("[a-ds-u]", "b")); // among a, m, n

		// 5th Way
		System.out.println("5th Way");
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Monica"));
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Sameer"));
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Anandi"));

		// 6th Way
		// [x]?, X occurs once or not at all
		System.out.println("6th Way");
		System.out.println(Pattern.matches("[xyz]?", "x"));
		System.out.println(Pattern.matches("[xyz]?", "xxyyyzz"));

		// 7th Way
		// [x]+, X occurs once or more times
		System.out.println("7th Way");
		System.out.println(Pattern.matches("[xyz]+", "x"));
		System.out.println(Pattern.matches("[xyz]+", "xxyyyzz"));

		// 8th Way
		// [x]*, X occurs zero or more times
		System.out.println("8th Way");
		System.out.println(Pattern.matches("[xyz]*", "xyyz"));
		System.out.println(Pattern.matches("[xyz]*", "xxyyyz"));

		// 9th Way
		// "\d", if the character sequence consists of any digit
		System.out.println("9th Way");
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "1a"));

		// 10th Way
		// "\D", if the character sequence consists of any character
		System.out.println("10th Way");
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "1a"));
		System.out.println(Pattern.matches("\\D", "a"));

		// 11th Way
		// to match length of characters
		System.out.println("11th Way");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "monica"));
	}

}
