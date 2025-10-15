package listInterface;


import java.util.ArrayList;
import java.util.List;

public class TodoList {
	public static void main(String[] args) {
		List<String> tasks = new ArrayList<>();
		
		tasks.add("check emails");
		tasks.add("get updation on task");
		tasks.add("code reveiw");
		tasks.add("submit report");
		
		System.out.println("today task ");
		for(String task : tasks) {
			System.out.println(task);
			
			
			tasks.remove("submit report");
			System.out.println("remaining tasks" + tasks);
		}
		
		
	}

}
