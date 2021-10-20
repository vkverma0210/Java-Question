package Map;

//import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		// 1. HashMap - No Order
//		HashMap<String, String> dictonary = new HashMap<String, String>();
//		dictonary.put("Brave", "ready to face and endure danger or pain; showing courage.");
//		dictonary.put("Brilliant", "exceptionally clever or talented.");
//		dictonary.put("Joy", "a feeling of great pleasure and happiness.");
//		dictonary.put("Confidence", "the state of feeling certain about the truth of something.");
//		
//		for(String word : dictonary.keySet()) {
//			System.out.println(word);
//		}

		// 2. LinkedHashMap - Order is maintained
//		LinkedHashMap<String, String> dictonary = new LinkedHashMap<String, String>();
//		dictonary.put("Brave", "ready to face and endure danger or pain; showing courage.");
//		dictonary.put("Brilliant", "exceptionally clever or talented.");
//		dictonary.put("Joy", "a feeling of great pleasure and happiness.");
//		dictonary.put("Confidence", "the state of feeling certain about the truth of something.");
//
//		for (String word : dictonary.keySet()) {
//			System.out.println(word);
//		}

		// 3. LinkedHashMap get value
//		LinkedHashMap<String, String> dictonary = new LinkedHashMap<String, String>();
//		dictonary.put("Brave", "ready to face and endure danger or pain; showing courage.");
//		dictonary.put("Brilliant", "exceptionally clever or talented.");
//		dictonary.put("Joy", "a feeling of great pleasure and happiness.");
//		dictonary.put("Confidence", "the state of feeling certain about the truth of something.");
//
//		for (String word : dictonary.keySet()) {
//			System.out.println(dictonary.get(word));
//		}
//
//		for (Map.Entry<String, String> entry : dictonary.entrySet()) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}

		// 4. TreeMap Alphabetical Order (Sorting)
		TreeMap<String, String> dictonary = new TreeMap<String, String>();
		dictonary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictonary.put("Brilliant", "exceptionally clever or talented.");
		dictonary.put("Joy", "a feeling of great pleasure and happiness.");
		dictonary.put("Confidence", "the state of feeling certain about the truth of something.");
		dictonary.put("Brilliant", "xxxxd");
		
		for (Map.Entry<String, String> entry : dictonary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//Map does not store duplicates keys
	}

}
