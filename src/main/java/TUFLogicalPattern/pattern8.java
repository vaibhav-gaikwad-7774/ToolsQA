package TUFLogicalPattern;

//Question Link: https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		System.out.println("Enter integers :");
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			for(int s = 1; s <= i-1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*n-2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//public class Solution {
//    public static void nStarTriangle(int n) {
//        for (int i =1 ; i<=n; i++){
//			for(int s = 1; s<=i-1; s++){
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=2*n-2*i+1; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
//    }
//}
