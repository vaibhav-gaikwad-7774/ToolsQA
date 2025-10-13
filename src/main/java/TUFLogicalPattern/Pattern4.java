package TUFLogicalPattern;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/triangle_6573690?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of N: ");
		
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
	}

}


//public class Solution {
//    public static void nTriangle(int n) {
//        for(int i = 1; i<=n; i++){
//			for(int j = 1; j<=i; j++){
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//	}
//}