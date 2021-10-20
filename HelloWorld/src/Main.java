import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
//		ArrayList<String> str = new ArrayList<>();
//		
//		str.add("aAaA");
//		str.add("AaA");
//		str.add("aAa");
//		str.add("AAaa");
//		Collections.sort(str);
//		
//		System.out.println(str);
		
		HashMap t = new HashMap();
		t.put(null, 1);
		Set s = t.keySet();
		Iterator iter = s.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
