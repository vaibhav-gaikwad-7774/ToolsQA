package TUFLogicalPattern;

import java.util.Scanner;

//Question Link: https://www.naukri.com/code360/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM


//1             1 
//1 2         2 1 
//1 2 3     3 2 1 
//1 2 3 4 4 3 2 1 

public class pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of n");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {

            // Left side numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Middle spaces
            for (int s = 1; s <= 2 * n - 2 * i; s++) {
                System.out.print("  ");
            }

            // Right side numbers (in reverse)
            for (int j = 1; j <= i; j++) {
                System.out.print((i - j + 1) + " ");
            }

            System.out.println();
        }
		
		
		
		
//		public class Solution {
//		    public static void numberCrown(int n) {
//		        for(int i =1; i<=n; i++){
//
//		            for(int j = 1; j<=i; j++){
//		                System.out.print(j+ " ");
//
//		            }
//
//		            for(int s = 1; s<=2*n-2*i; s++){
//		                System.out.print(" ");
//		            }
//		            for(int j = 1; j <= i; j++){
//		                System.out.print((i-j+1)+" ");
//		            }
//		            System.out.println();
//		        }
//		    }
//		}
		
		
    }
}