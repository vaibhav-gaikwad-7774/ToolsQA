package StringClass;

import java.util.Scanner;

public class StringTestExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string which is you wanted to print =>");
		String sPolpularTopic = sc.next();
		
		System.out.println("Enter a another string which is you wanted to print =>");
		String sPolpularTopicAnother = sc.next();
		
		System.out.println(sPolpularTopic.concat(sPolpularTopicAnother));
		
		int ilenght = sPolpularTopic.length();
		
		System.out.println("The popular topic name which is  = > " + sPolpularTopic);
		System.out.println("The Length of the topic which is "+ ilenght);
	}

}
