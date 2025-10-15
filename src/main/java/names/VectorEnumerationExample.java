package names;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationExample {

	public static void main(String[] args) {
		Vector<Integer> number = new Vector<>();
		
		for(int i = 1; i<=5; i++) {
			number.add(i);
		}
		
		System.out.println("vectors element using enumeration: ");


		Enumeration<Integer> e = number.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
	}

}
