package listInterface;


import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		
		//using for loop: 
		
		
		
//		for(int i = 1; i<=fruits.size(); i++) {
//			System.out.println(fruits);
//		}
		
		System.out.println(fruits);
		
		System.out.println(fruits.get(1));
		
		fruits.set(2, "orange");
		
		System.out.println("updated list" + fruits);
		
		fruits.remove("apple");
		
		System.out.println(fruits + ":  after removing element from list");

		System.out.println("list of fruits: ");
		
		
		
		
		
		
	}

}
