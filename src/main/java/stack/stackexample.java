 package stack;

import java.util.Stack;

public class stackexample {
	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		
		
		books.push("java programming");
		books.push("python basics");
		
		books.push("data structure");
		books.push("algorithm");
		
		System.out.println("Stack : "+ books);
		
		System.out.println("Top element : " + books.peek());
		
		System.out.println("popped element: " + books.pop());
		
		System.out.println("position of java programming: "+ books.search("java programming"));
		
		if(books.empty()) {
			System.out.println("stack is empty");
		}else {
			System.out.println("stack not empty");
		}
		
		
		
		
	}

}
