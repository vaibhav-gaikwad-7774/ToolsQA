package TUFLogicalPattern;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class pattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				if((i+j)%2 == 0) {
					System.out.print(1 + " ");
					
				}else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
		
	}

}
