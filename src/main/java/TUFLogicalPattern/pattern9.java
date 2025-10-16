package TUFLogicalPattern;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a integer which you want to ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int s = 1; s <= n-i; s++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++");
		
		for(int i = n; i>=1; i--) {
			for(int s = 1; s<=n-i; s++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j<=2* i-1; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}

//🔹 Upper Half:
//Total rows = n
//For each row i:
//Print (n - i) spaces.
//Then print (2 * i - 1) stars.
//🔹 Lower Half:
//Also has n rows.
//For each row i (starting from n down to 1):
//Print (n - i) spaces.
//Then print (2 * i - 1) stars.

//public class Solution {
//    public static void nStarDiamond(int n) {
//        for(int i = 1; i<=n; i++){
//            for(int s = 1; s<= n-i; s++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = n; i>=1; i--){
//            for(int s = 1; s<= n-i; s++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }  
//}
