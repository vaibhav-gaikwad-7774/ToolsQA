package Vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String>  names = new Vector<>();
		
		
		names.add("Vaibhav");
		names.add("amit");
		names.add("sakshi");
		names.add("ravi");
		
		
		System.out.println("intial vector: "+ names);
		
		
		names.add(2, "priya");
		 System.out.println("After initialization" + names);
		 
		 
		 names.remove(3);
		 System.out.println("After removing the index of 3"+ names);
		 
		 System.out.println("size; " + names.size());
		 System.out.println("capacity: " + names.capacity());
		 

	}

}
