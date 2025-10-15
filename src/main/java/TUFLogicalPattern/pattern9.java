package TUFLogicalPattern;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner (System.in);
		System.out.println("Enter n integer which you want to print: ");
		
		int n = sc.nextInt();
	
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i+n-1; j++ ) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		

	}

}
