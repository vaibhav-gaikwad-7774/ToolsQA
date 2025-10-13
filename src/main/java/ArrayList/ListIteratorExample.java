package ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		
		words.add("java");
		words.add("Python");
		words.add("C++");
		words.add("JavaScript");
		
		ListIterator<String> it  = words.listIterator();
		
		System.out.println("forward travarsal");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("backend travarsal");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		it = words.listIterator();
		while(it.hasNext()) {
			String word = it.next();
			it.set(words + "language");
		}
		
		System.out.println("modified list");
		for(String word : words) {
			System.out.println(word);
		}
		
		
	}

}
