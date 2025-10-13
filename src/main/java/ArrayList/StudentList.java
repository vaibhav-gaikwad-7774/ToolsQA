package ArrayList;

import java.util.ArrayList;
import java.util.List;

	class Student{
		String name;
		double marks;
	
		Student(String name, double marks){
			this.name = name;
			this.marks = marks;
			
		}
		
		void display() {
			System.out.println("name: "+ name + ", marks: "+ marks);
		}
	}
	
	
	
	public class StudentList {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Alice", 28.3));
		students.add(new Student( "Bob", 55.2));
		students.add(new Student("charlie", 63.2));
		
		System.out.println("intial students list: ");
		for(Student s : students)s.display();

	}

}
