package Hashtable;

import java.util.Hashtable;

public class CheckHashTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> marks = new Hashtable<>();
		
		
		marks.put("math", 90);
		marks.put("marathi", 30);
		marks.put("eng", 80);
		
		System.out.println(marks.containsKey("marathi"));
		System.out.println(marks.containsValue(40));

	}

}
