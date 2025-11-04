package TUFBasicPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String which you want to print");
		
		String str = sc.next();
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println("The Reverse of the String"+ str+ " is : "+ reverse );
		
		
		if (str.equals(reverse)) {
			System.out.println("The String "+ str + "is palindrome");
		}else {
			System.out.println("The String" + str+ "is not an palindrome" );
		}
		
	}

}
