package TUFLogicalPattern;

import java.util.Scanner;

public class pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print((char)('A'-1+j)+ " ");
			}
			System.out.println();
		}
	}

}
