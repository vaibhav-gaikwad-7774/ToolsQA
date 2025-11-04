package TUFBasicPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int rev = 0;
		
		while (x !=0) {
			int rem = x % 10;
			
			int maxval = Integer.MAX_VALUE/10;
			int minval = Integer.MIN_VALUE/10;
			
			if(rev > maxval || rev < minval) {
				return 0;
			}
			
			rev = rev * 10 + rem;
			
			x /=10;
		}
		return rev;
		

	}

}
