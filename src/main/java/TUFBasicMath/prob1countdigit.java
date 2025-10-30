package TUFBasicMath;

import java.util.Scanner;

public class prob1countdigit {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	
	int temp = N;
	
	int count = 0;
	
	
	while (temp != 0) {
		int rem = temp % 10;
		
		if(rem != 0 && N % rem == 0) {
			count ++;
		}
		
		temp
	}
	
	
	

}
