package TUF;

import java.util.Scanner;

public class ifelsestate {

	public static String compareNM(int n, int m) {
		return(n>m) ? "greater" : (n<m) ? "lesser" : "equal";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(compareNM(n, m));
		
		sc.close();
		
		
	}
	
	

}
