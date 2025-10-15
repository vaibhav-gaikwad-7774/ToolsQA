package stack;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		String input = "hello";
		
		Stack<Character> stack = new Stack<>();
		
		
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		
		StringBuilder reversed = new StringBuilder();
		while(! stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		
		System.out.println("original String: "+ input);
		System.out.println("Reversed String: "+reversed.toString());
	}

}
