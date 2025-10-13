package Dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryExample {

	public static void main(String[] args) {
		Dictionary<String, String> dict = new Hashtable<>();
		
		//add values 
		dict.put("java", "A programming language");
		dict.put("python", "a scripting language");
		dict.put("html", "a markup language");
			
		
		System.out.println("Dictionary content: ");
		Enumeration<String> keys = dict.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println("words: "+ key + "meaning " + dict.get(keys) );
		}
	}

}
