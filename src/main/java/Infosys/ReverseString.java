package Infosys;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String which you want to print: ");
		String str = sc.next();
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println("The reverse of string " + str + " is "+ reverse);    
		
		
		
		
		
		
		
		
	}

}
