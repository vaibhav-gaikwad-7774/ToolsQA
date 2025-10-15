package Hashtable;

import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> students = new Hashtable<>();
		
		students.put(1, " vaibhav");
		students.put(2, " ganesh");
		students.put(3, " vivek");
		
		
		System.out.println(students.get(2));
		System.out.println(students);
		
		students.put(3, "amit");
		
		students.remove(1);
		System.out.println(students);
		
		System.out.println("All students");
		
		for(Integer id : students.keySet()) {
			System.out.println("id: "+ id + " name : " + students.get(id) );
		}
	}

}
