package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		words.add("school");
		words.add(0, "at");
		words.add(1, "work");
		
		System.out.println("print the values of the ArrayString: ");
		for(int i = 0; i<words.size(); i++) {
			System.out.println("words["+ i + "] " + words.get(i));
		}
		
		words.remove(0);
		System.out.println(words);
		
		
	}

}
