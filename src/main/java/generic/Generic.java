package generic;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hellow");
		list.add("vaibhav ");
	
		
		
		String str = list.get(0);
		String str1 = list.get(1);
		System.out.println( str +" "+ str1);
		
	}
}
