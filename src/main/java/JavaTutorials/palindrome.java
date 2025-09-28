package JavaTutorials;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String which you want to check: ");
		String str = sc.nextLine();
		
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equals(reverse)) {
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
			
		}

	}

}
