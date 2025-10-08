package TUF;

import java.util.Scanner;

public class UserInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Please enter your choice");
		
		char ch = sc.next().charAt(0);
		
		if (ch >= 'A' && ch<='Z') {
			
			System.out.println(0);
		}
		
		if (ch >= 'a' && ch<='z') {
			
			System.out.println(1);
		}
		else {
			System.out.println(-1);
		}
		sc.close();
	

	}

}
