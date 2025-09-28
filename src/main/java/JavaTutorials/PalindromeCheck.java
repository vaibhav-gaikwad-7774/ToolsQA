package JavaTutorials;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a String which you want to check its pelindrome: ");
		
		String str  = sc.nextLine();
			
		String reverse = new StringBuilder (str).reverse().toString();
		if(str.equals(reverse)) {
			System.out.println("The String is Palindroome");
		}else {
			System.out.println("The String is not Palindroome");
		}
	}

}
