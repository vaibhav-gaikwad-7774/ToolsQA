package TUF;

import java.util.Scanner;

public class solutionreversemulti {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a integer which you want to print : ");
		
		int n = sc.nextInt();
		int i = 10;
		
		while(i>= n) {
			System.out.println((n * i) + "  ");
			i--;
		}
		System.out.println();
		
			
	
	

	}
	
}
