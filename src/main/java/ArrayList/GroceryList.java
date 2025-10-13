package ArrayList;

import java.util.ArrayList;

public class GroceryList {
	public static void main(String[] args) {
		ArrayList<String> groceries = new ArrayList<>();
		
		
		groceries.add("milk");
		groceries.add("bread");
		groceries.add("eggs");
		groceries.add("butter");
		
		System.out.println("using for loop: ");
		
		for(int i = 0; i< groceries.size(); i++) {
			System.out.println(groceries.get(i));
		}
		
		System.out.println("using for enhanced forloop: ");
		
		for(String item : groceries) {
			System.out.println(item);
		}
		
		
		
		System.out.println("grocery list: "+ groceries);
		
		System.out.println("first Item " + groceries.get(0));
		
		groceries.set(1, "brown breads");
		
		groceries.remove("eggs");
		
		System.out.println("the updated total number of items: "+ groceries.size());
		
		System.out.println("Updated groceries list: "+ groceries);
	}

}
