package TUFLogicalPattern;

import java.util.Scanner;

//https://www.naukri.com/code360/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
//Input: ‘N’ = 3
//
//Output: 
//* * *
//* * *
//* * *

public class pattern1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of n which you want: ");
	int n = sc.nextInt();
	
	for(int i = 1; i<=n; i++) {
		
		for (int j = 1; j<=n; j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	}
}


//public class Solution {
//    public static void nForest(int n) {
//        for (int i = 1; i<=n; i++){
//            for(int j = 1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}



