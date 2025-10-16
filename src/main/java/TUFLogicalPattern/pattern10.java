package TUFLogicalPattern;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


public class pattern10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i= 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i= n-1; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


//public class Solution {
//    public static void nStarTriangle(int n) {
//        for (int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n-1; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//    }
//}