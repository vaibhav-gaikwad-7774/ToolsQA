package Polymorphism;

//Compile-time Polymorphism which is decide on the parameters
// number of passing or the type of the parameters
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}


class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(10, 20, 40));
		System.out.println(calc.add(10, 20));
		
		System.out.println(calc.add(10.4, 20));

	}

}
