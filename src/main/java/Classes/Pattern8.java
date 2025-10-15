package Classes;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num which you want to :");
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int s = 1; s<=i; s++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=2*n-2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
