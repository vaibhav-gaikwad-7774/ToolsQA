package Infosys;

import java.util.Scanner;

public class palindrometest {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter a string which you want to check the palindrome or not: ");
		String str = sc.next();
		String reverse = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println("The String "+ str + " is palindrome");
		}
		else {
			System.out.println("The String "+ str +" is not palindrome");
		}
		

	}

}
