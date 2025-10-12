package Exception;

import java.util.Scanner;

class Bank{
	void vidharval(int amount) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount in rs: ");
		 amount = sc.nextInt();
		 
		
		if(amount>10000) {
			throw new Exception("withrawal limit exceeds");
		}else {
			System.out.println("withraval successfull with the amount which is "+ amount);
		}
			
		}
	}


public class bankexception {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		try {
			bank.vidharval(15000);
			
		}catch(Exception e){
			System.out.println("error "+ e.getMessage());
			
		}

	}

}
