package TUFLogicalPattern;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j<=n -i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
