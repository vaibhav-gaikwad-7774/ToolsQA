package TUFLogicalPattern;

//Question Link: https://www.naukri.com/code360/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems


import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which you want to: ");
		
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) {
			for(int s = 1; s<n-i; s++ ) {
				System.out.print(" ");
				
			}
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}}













//public class Solution {
//    public static void nStarTriangle(int n) {
//        for(int i = 1; i<=n; i++){
//            for(int s = 1; s<=n-i; s++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
