package TUF;

import java.util.Scanner;

public class SolutionDatatype2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your choice");
		 String str = sc.next();
		 
		 
		 if(str.equals("Character")) System.out.println("2");
		 else if(str.equals("Integer")) System.out.println("4");
		 else if(str.equals("Long")) System.out.println("8");
		 else if(str.equals("Float")) System.out.println("4");
		 else if(str.equals("Double")) System.out.println("8");
		 else
			 System.out.println("-1");
		 
		 sc.close();

	}
	

}
