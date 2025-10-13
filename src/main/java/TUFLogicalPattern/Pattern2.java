package TUFLogicalPattern;

import java.util.Scanner;

//https://www.naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of n: ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}

//public class Solution {
//    public static void nForest(int n) {
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//}
//}



