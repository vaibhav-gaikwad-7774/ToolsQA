package Example;

public class Relational_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ten = 10;
		int twenty = 20;
		int thirty = 30;
		
		System.out.println("greater than operator");
		System.out.println(ten>twenty);
		System.out.println(twenty>ten);
		System.out.println(thirty>twenty);
		
		
		System.out.println("greater than or equal to operator");
		System.out.println(ten>=twenty);
		System.out.println(twenty>=ten);
		System.out.println(thirty>=twenty);
		
		System.out.println("less than or equal to operator");
		System.out.println(ten<=twenty);
		System.out.println(twenty<=ten);
		System.out.println(thirty<=twenty);
		
		System.out.println("equal to operator");
		System.out.println(ten==twenty);
		System.out.println(thirty==ten+twenty);
		
		
		System.out.println("not equal to operator");
		System.out.println(ten!=twenty);
		System.out.println(thirty!=ten+twenty);
		
			

	}

}
