package TUF;

import java.util.Scanner;

public class UserInputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string which you want to check");
		
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("1");
		
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("0");
			
	}else
		System.out.println("-1");
	
}}